package com.fitness.themes

import androidx.compose.ui.graphics.Color

/**
 * To name new color go to [colornames](https://colornames.org/search/) and take name of color.
 * If color unnamed in colornames you free to name it that you want.
 * If your color contains alpha chanel then you should add to color number equals to alpha value
 *
 * Example:
 *
 * color: #162025
 *
 * name: [Fitness black](https://colornames.org/search/162025)
 *
 * if this color contained an alpha channel with a value of 80
 * the resulting name would be **fitnessBlack80**
 *
 * Compose color format is aRGB so if your color not contains alpha chanel, your color should start with FF
 */

val white = Color(0xFFFFFFFF)
val black12 = Color(0x1e000000)

val fitnessBlack = Color(0xFF162025)
val lightGlover = Color(0xFF4ad86f)
val gettingDarker = Color(0xFF979797)
val blackPipes = Color(0xFF263035)
val commutatorOrange = Color(0xFFF0810F)