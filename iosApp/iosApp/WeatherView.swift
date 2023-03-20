//
//  NowWeatherView.swift
//  KMMWeather
//
//  Created by ByteDance on 2023/3/16.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct WeatherView: View {
    var data: AllWeatherData
    
    var body: some View {
        var now = data.now
        VStack{
            VStack(alignment: HorizontalAlignment.leading, spacing: 10) {
                HStack {
                    Text("杭州市")
                    Text(now.updateTime)
                }
                HStack {
                    Text(now.now.text)
                    Text("\(now.now.temp)°").font(Font.title2).fontWeight(Font.Weight.bold)
                }
                Text(now.now.windDir + now.now.windScale + "级")
                Text("相对湿度\(now.now.humidity)%")
                Text("大气压强\(now.now.pressure)百帕")
            }
            
            
            List(data.forecast.daily, id: \.self) { day in
                DailyWeatherItem(day: day)
            }
        }
    }
}

struct DailyWeatherItem: View {
    var day: Daily
    
    var body: some View {
        HStack(spacing: 20) {
            Text(day.fxDate)
            Text(day.textDay)
            Text("\(day.tempMin)-\(day.tempMax)")
        }
    }
}
