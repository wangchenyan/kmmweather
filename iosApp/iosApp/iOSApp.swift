import SwiftUI
import shared

@main
struct iOSApp: App {
    let weather = Weather(databaseDriverFactory: DatabaseDriverFactory())
    var body: some Scene {
        WindowGroup {
            ContentView(viewModel: .init(weather: weather))
        }
    }
}
