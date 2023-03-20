package top.wangchenyan.kmmweather.db

import com.squareup.sqldelight.db.SqlDriver

/**
 * Created by wangchenyan.top on 2023/3/16.
 */
expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}