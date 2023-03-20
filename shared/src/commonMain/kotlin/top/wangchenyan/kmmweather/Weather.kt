package top.wangchenyan.kmmweather

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.http.URLBuilder
import io.ktor.http.URLProtocol
import io.ktor.http.encodedPath
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import top.wangchenyan.kmmweather.bean.AllWeatherData
import top.wangchenyan.kmmweather.bean.ForecastWeatherData
import top.wangchenyan.kmmweather.bean.NowWeatherData
import top.wangchenyan.kmmweather.db.Database
import top.wangchenyan.kmmweather.db.DatabaseDriverFactory

/**
 * Created by wangchenyan.top on 2023/3/15.
 */
class Weather(databaseDriverFactory: DatabaseDriverFactory) {

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }

    private val database = Database(databaseDriverFactory)

    suspend fun getAllFromNet(): AllWeatherData {
        return AllWeatherData(getNowWeatherFromNet(), get7DWeatherFromNet())
    }

    suspend fun getAllFromDb(): AllWeatherData? {
        val now = getNowWeatherFromDb()
        val forecast = get7DWeatherFromDb()
        if (now != null && forecast != null) {
            return AllWeatherData(now, forecast)
        }
        return null
    }

    suspend fun getNowWeatherFromNet(): NowWeatherData {
        val url = assembleUrl(PATH_NOW_WEATHER)
        return httpClient.get(url).body<NowWeatherData>().also {
            database.insertNowWeather(it)
        }
    }

    suspend fun getNowWeatherFromDb(): NowWeatherData? {
        return withContext(Dispatchers.Default) {
            database.getNowWeather()
        }
    }

    suspend fun get7DWeatherFromNet(): ForecastWeatherData {
        val url = assembleUrl(PATH_WEATHER_FORECAST_7D)
        return httpClient.get(url).body<ForecastWeatherData>().also {
            database.insertForecastWeather(it)
        }
    }

    suspend fun get7DWeatherFromDb(): ForecastWeatherData? {
        return withContext(Dispatchers.Default) {
            database.getForecastWeather()
        }
    }

    private fun assembleUrl(path: String): String {
        return URLBuilder(
            protocol = URLProtocol.HTTPS,
            host = "devapi.qweather.com",
        ).apply {
            encodedPath = "/v7/weather${path}"
            encodedParameters.append("key", "dd01315398b64840a1765e5674e27f8f")
            encodedParameters.append("location", "101210101")
        }.buildString()
    }

    companion object {
        private const val PATH_NOW_WEATHER = "/now"
        private const val PATH_WEATHER_FORECAST_7D = "/7d"
    }
}