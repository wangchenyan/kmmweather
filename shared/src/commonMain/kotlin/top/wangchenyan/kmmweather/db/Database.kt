package top.wangchenyan.kmmweather.db

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import top.wangchenyan.kmmweather.bean.ForecastWeatherData
import top.wangchenyan.kmmweather.bean.NowWeatherData

/**
 * Created by wangchenyan.top on 2023/3/16.
 */
internal class Database(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = AppDatabase(databaseDriverFactory.createDriver())
    private val dbQuery = database.appDatabaseQueries

    private val json = Json {
        prettyPrint = true
        isLenient = true
        ignoreUnknownKeys = true
    }

    internal fun clearDatabase() {
        dbQuery.transaction {
            dbQuery.removeAllNowWeather()
            dbQuery.removeAllForecastWeather()
        }
    }

    internal fun insertNowWeather(data: NowWeatherData) {
        dbQuery.insertNowWeather(json.encodeToString(data))
    }

    internal fun getNowWeather(): NowWeatherData? {
        val entity = dbQuery.selectNowWeather().executeAsOneOrNull()
        if (entity?.json?.isNotEmpty() == true) {
            return json.decodeFromString(entity.json)
        }
        return null
    }

    internal fun insertForecastWeather(data: ForecastWeatherData) {
        dbQuery.insertForecastWeather(json.encodeToString(data))
    }

    internal fun getForecastWeather(): ForecastWeatherData? {
        val entity = dbQuery.selectForecastWeather().executeAsOneOrNull()
        if (entity?.json?.isNotEmpty() == true) {
            return json.decodeFromString(entity.json)
        }
        return null
    }
}