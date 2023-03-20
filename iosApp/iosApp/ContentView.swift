import SwiftUI
import shared

struct ContentView: View {
    @ObservedObject private(set) var viewModel: ViewModel
    
    var body: some View {
        NavigationView {
            listView()
                .navigationBarTitle("KMM Weather")
                .navigationBarItems(trailing:
                                        Button("Net") {
                    self.viewModel.loadFromNet()
                })
                .navigationBarItems(trailing:
                                        Button("Cache") {
                    self.viewModel.loadFromCache()
                })
        }
    }
    
    private func listView() -> AnyView {
        switch viewModel.state {
        case .idle:
            return AnyView(Text("请选择加载方式"))
        case .loading:
            return AnyView(Text("Loading...").multilineTextAlignment(.center))
        case .result(let data):
            return AnyView(WeatherView(data: data))
        case .error(let description):
            return AnyView(Text(description).multilineTextAlignment(.center))
        }
    }
}

extension ContentView {
    enum PageState {
        case idle
        case loading
        case result(AllWeatherData)
        case error(String)
    }
    
    class ViewModel: ObservableObject {
        let weather: Weather
        @Published var state = PageState.idle
        
        init(weather: Weather) {
            self.weather = weather
        }
        
        func loadFromNet() {
            self.state = .loading
            weather.getAllFromNet { data, error in
                if let data = data {
                    self.state = .result(data)
                } else {
                    self.state = .error(error?.localizedDescription ?? "error")
                }
            }
        }
        
        func loadFromCache() {
            self.state = .loading
            DispatchQueue.main.asyncAfter(deadline: .now() + 1) {
                self.weather.getAllFromDb { data, error in
                    if let data = data {
                        self.state = .result(data)
                    } else {
                        self.state = .error(error?.localizedDescription ?? "no cache")
                    }
                }
            }
        }
    }
}
