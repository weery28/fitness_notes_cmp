package com.fitness.ui

import androidx.compose.runtime.*
import com.fitness.themes.MainTheme
import com.fitness.ui.models.WorkoutsListItem
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MainTheme {
        WorkoutsList(listOf(
            WorkoutsListItem.Date(date = "21.11.2024"),
            WorkoutsListItem.Workout(
                id = 1,
                name = "Отжимания",
                time = "10:51"
            ),
            WorkoutsListItem.Workout(
                id = 2,
                name = "Отжимания",
                time = "10:51"
            ),
            WorkoutsListItem.Workout(
                id = 3,
                name = "Отжимания",
                time = "10:51"
            )
        ))
    }
}