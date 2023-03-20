package top.wangchenyan.kmmweather.bean


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastWeatherData(
    @SerialName("code")
    val code: String = "",
    @SerialName("daily")
    val daily: List<Daily> = listOf(),
    @SerialName("fxLink")
    val fxLink: String = "",
    @SerialName("refer")
    val refer: Refer = Refer(),
    @SerialName("updateTime")
    val updateTime: String = ""
)