package com.serafimov.nexxt.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

private val colorTeal600 = Color(0xFF00897B)
private val colorTeal700 = Color(0xFF00796B)
private val colorTeal800 = Color(0xFF00695C)
private val colorTeal900 = Color(0xFF004D40)
private val colorGrey200 = Color(0xFFEEEEEE)
private val colorGrey400 = Color(0xFFBDBDBD)
private val colorGrey500 = Color(0xFF9E9E9E)
private val colorGrey600 = Color(0xFF757575)
private val colorGrey800 = Color(0xFF424242)
private val colorGrey900 = Color(0xFF212121)
private val colorWhite = Color(0xFFFFFFFF)
private val colorBlack = Color(0xFF000000)

val lightThemeColors = lightColors(
  primary = colorTeal600,
  onPrimary = colorWhite,
  primaryVariant = colorTeal700,
  background = colorGrey200,
  onBackground = colorBlack,
  surface = colorWhite,
  onSurface = colorBlack
)

val darkThemeColors = darkColors(
  primary = colorTeal800,
  onPrimary = colorWhite,
  primaryVariant = colorTeal900,
  background = colorGrey900,
  onBackground = colorWhite,
  surface = colorBlack,
  onSurface = colorWhite,
)

val Colors.textTitle: Color
  get() = onSurface

val Colors.textBody: Color
  get() = if (isLight) colorGrey600 else colorGrey400

val Colors.textButton: Color
  get() = onPrimary

val Colors.buttonPrimaryBackground: Color
  get() = primaryVariant

val Colors.buttonSecondaryBackground: Color
  get() = if (isLight) colorGrey500 else colorGrey800