package com.serafimov.nexxt.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
  val themeColors = if (darkTheme) {
    darkThemeColors
  } else {
    lightThemeColors
  }

  MaterialTheme(
    colors = themeColors,
    typography = themeTypography,
    shapes = themeShapes,
    content = content
  )
}