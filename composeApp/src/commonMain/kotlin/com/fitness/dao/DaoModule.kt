package com.fitness.dao

import app.cash.sqldelight.db.SqlDriver
import com.fitness.Database
import com.fitness.model.Exercise
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

val daoModule = DI.Module("dao"){

    bind<DriverFactory>() with singleton { DriverFactory() }
    bind<Database>() with singleton { createDatabase(instance()) }
}

expect class DriverFactory() {
    fun createDriver(): SqlDriver
}

fun createDatabase(driverFactory: DriverFactory): Database {
    val driver = driverFactory.createDriver()

    return Database(driver)
}