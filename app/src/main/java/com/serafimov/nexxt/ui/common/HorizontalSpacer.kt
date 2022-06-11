package com.serafimov.nexxt.ui.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun HorizontalSpacer(height: Dp) {
  Spacer(
    modifier = Modifier
      .fillMaxWidth()
      .height(height)
  )
}