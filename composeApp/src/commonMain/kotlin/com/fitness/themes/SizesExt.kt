package com.fitness.themes

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val MaterialTheme.sizes: Sizes
    get() = SizesImpl

interface Sizes {
    // Margins
    val primaryHorizontalMargin: Dp
    val primaryVerticalMargin: Dp
    val betweenElementsMargin: Dp

    // Paddings
    val primaryHorizontalPadding: Dp
    val primaryVerticalPadding: Dp

    // Radius
    val shapeCornerRadius: Dp
}

private object SizesImpl : Sizes {
    override val primaryHorizontalMargin: Dp
        get() = 16.dp
    override val primaryVerticalMargin: Dp
        get() = 16.dp
    override val betweenElementsMargin: Dp
        get() = 16.dp

    override val primaryHorizontalPadding: Dp
        get() = 16.dp
    override val primaryVerticalPadding: Dp
        get() = 16.dp

    override val shapeCornerRadius: Dp
        get() = 4.dp
}