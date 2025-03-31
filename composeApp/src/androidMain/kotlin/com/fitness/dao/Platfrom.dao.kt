package com.fitness.dao

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.fitness.Database
import com.fitness.app.AppContext

actual class DriverFactory {
    actual fun createDriver(): SqlDriver {

        return AndroidSqliteDriver(Database.Schema, AppContext.instance, "app.db")
    }
}