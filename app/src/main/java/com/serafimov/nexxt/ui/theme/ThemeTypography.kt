package com.serafimov.nexxt.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val themeTypography = Typography(
  h6 = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = 18.sp,
    letterSpacing = 0.15.sp
  ),
  body1 = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    letterSpacing = 0.5.sp
  ),
  button = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.W500,
    fontSize = 14.sp
  ),
  subtitle1 = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    letterSpacing = 0.15.sp
  )
)