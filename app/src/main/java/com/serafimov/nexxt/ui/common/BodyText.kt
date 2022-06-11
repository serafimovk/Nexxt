package com.serafimov.nexxt.ui.common

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.serafimov.nexxt.ui.theme.textBody

@Composable
fun BodyText(text: String) {
  Text(
    text = text,
    style = MaterialTheme.typography.body1,
    color = MaterialTheme.colors.textBody
  )
}