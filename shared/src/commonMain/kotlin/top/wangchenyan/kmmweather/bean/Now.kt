package top.wangchenyan.kmmweather.bean

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Now(
    @SerialName("cloud")
    val cloud: String = "",
    @SerialName("dew")
    val dew: String = "",
    @SerialName("feelsLike")
    val feelsLike: String = "",
    @SerialName("humidity")
    val humidity: String = "",
    @SerialName("icon")
    val icon: String = "",
    @SerialName("obsTime")
    val obsTime: String = "",
    @SerialName("precip")
    val precip: String = "",
    @SerialName("pressure")
    val pressure: String = "",
    @SerialName("temp")
    val temp: String = "",
    @SerialName("text")
    val text: String = "",
    @SerialName("vis")
    val vis: String = "",
    @SerialName("wind360")
    val wind360: String = "",
    @SerialName("windDir")
    val windDir: String = "",
    @SerialName("windScale")
    val windScale: String = "",
    @SerialName("windSpeed")
    val windSpeed: String = ""
)