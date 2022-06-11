package com.serafimov.nexxt.ui.common

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.serafimov.nexxt.ui.theme.textTitle

@Composable
fun TitleText(text: String) {
  Text(
    text = text,
    style = MaterialTheme.typography.h6,
    color = MaterialTheme.colors.textTitle
  )
}