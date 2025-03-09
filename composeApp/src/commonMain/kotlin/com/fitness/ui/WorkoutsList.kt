package com.fitness.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fitness.themes.sizes
import com.fitness.ui.models.WorkoutsListItem

@Composable
fun WorkoutsList(workoutData: List<WorkoutsListItem>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        items(workoutData) {
            when(it) {
                is WorkoutsListItem.Date -> WorkoutDate(it)
                is WorkoutsListItem.Workout -> WorkoutListItem(it)
            }
        }
    }
}

@Composable
fun WorkoutDate(date: WorkoutsListItem.Date) {
    Text(
        text = date.date,
        modifier = Modifier
            .padding(vertical = MaterialTheme.sizes.primaryVerticalPadding / 2)
            .background(
                color = MaterialTheme.colors.onBackground,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(
                vertical = MaterialTheme.sizes.primaryVerticalMargin,
                horizontal = MaterialTheme.sizes.primaryVerticalMargin
            ),
        style = MaterialTheme.typography.button,
        color = MaterialTheme.colors.onPrimary
    )
}

@Composable
fun WorkoutListItem(workout: WorkoutsListItem.Workout) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                vertical = MaterialTheme.sizes.betweenElementsMargin / 2,
                horizontal = MaterialTheme.sizes.primaryHorizontalMargin
            )
            .background(
                color = MaterialTheme.colors.onBackground,
                shape = RoundedCornerShape(MaterialTheme.sizes.shapeCornerRadius)
            )
            .padding(
                vertical = MaterialTheme.sizes.primaryVerticalMargin,
                horizontal = MaterialTheme.sizes.primaryHorizontalMargin
            )
    ) {
        Text(
            text = workout.name,
            color = MaterialTheme.colors.onPrimary,
            style = MaterialTheme.typography.button
        )
    }
}