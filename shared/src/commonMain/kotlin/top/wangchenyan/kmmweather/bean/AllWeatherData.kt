package top.wangchenyan.kmmweather.bean

/**
 * Created by wangchenyan.top on 2023/3/16.
 */
data class AllWeatherData(
    val now: NowWeatherData,
    val forecast: ForecastWeatherData
)
