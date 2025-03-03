package com.fitness.ui.models

sealed interface WorkoutsListItem {

    data class Date(val date: String) : WorkoutsListItem

    data class Workout(
        val id: Long,
        val name: String,
        val time: String //format: HH:mm
    ) : WorkoutsListItem
}