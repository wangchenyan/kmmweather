package top.wangchenyan.kmmweather.bean

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Daily(
    @SerialName("cloud")
    val cloud: String = "",
    @SerialName("fxDate")
    val fxDate: String = "",
    @SerialName("humidity")
    val humidity: String = "",
    @SerialName("iconDay")
    val iconDay: String = "",
    @SerialName("iconNight")
    val iconNight: String = "",
    @SerialName("moonPhase")
    val moonPhase: String = "",
    @SerialName("moonPhaseIcon")
    val moonPhaseIcon: String = "",
    @SerialName("moonrise")
    val moonrise: String = "",
    @SerialName("moonset")
    val moonset: String = "",
    @SerialName("precip")
    val precip: String = "",
    @SerialName("pressure")
    val pressure: String = "",
    @SerialName("sunrise")
    val sunrise: String = "",
    @SerialName("sunset")
    val sunset: String = "",
    @SerialName("tempMax")
    val tempMax: String = "",
    @SerialName("tempMin")
    val tempMin: String = "",
    @SerialName("textDay")
    val textDay: String = "",
    @SerialName("textNight")
    val textNight: String = "",
    @SerialName("uvIndex")
    val uvIndex: String = "",
    @SerialName("vis")
    val vis: String = "",
    @SerialName("wind360Day")
    val wind360Day: String = "",
    @SerialName("wind360Night")
    val wind360Night: String = "",
    @SerialName("windDirDay")
    val windDirDay: String = "",
    @SerialName("windDirNight")
    val windDirNight: String = "",
    @SerialName("windScaleDay")
    val windScaleDay: String = "",
    @SerialName("windScaleNight")
    val windScaleNight: String = "",
    @SerialName("windSpeedDay")
    val windSpeedDay: String = "",
    @SerialName("windSpeedNight")
    val windSpeedNight: String = ""
)