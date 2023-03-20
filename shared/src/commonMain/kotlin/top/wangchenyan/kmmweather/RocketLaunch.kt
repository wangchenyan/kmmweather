package top.wangchenyan.kmmweather

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by wangchenyan.top on 2023/3/14.
 */
@Serializable
data class RocketLaunch(
    @SerialName("flight_number")
    val flightNumber: Int,
    @SerialName("name")
    val missionName: String,
    @SerialName("date_utc")
    val launchDateUTC: String,
    @SerialName("success")
    val launchSuccess: Boolean?,
)