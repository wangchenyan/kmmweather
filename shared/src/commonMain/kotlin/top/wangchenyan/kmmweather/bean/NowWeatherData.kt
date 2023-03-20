package top.wangchenyan.kmmweather.bean

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NowWeatherData(
    @SerialName("code")
    val code: String = "",
    @SerialName("fxLink")
    val fxLink: String = "",
    @SerialName("now")
    val now: Now = Now(),
    @SerialName("refer")
    val refer: Refer = Refer(),
    @SerialName("updateTime")
    val updateTime: String = ""
)