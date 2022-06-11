package com.serafimov.nexxt.ui.navigation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Movie
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.serafimov.nexxt.ui.theme.Dimens

@Composable
fun TopAppBar(titleText: String) {
  TopAppBar(
    title = {
      Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
          imageVector = Icons.Filled.Movie,
          tint = MaterialTheme.colors.onPrimary,
          contentDescription = null,
        )
        Text(
          text = titleText,
          color = MaterialTheme.colors.onPrimary,
          modifier = Modifier.padding(
            Dimens.spacingLarge,
            Dimens.noSpacing,
            Dimens.noSpacing,
            Dimens.noSpacing
          )
        )
      }
    },
    backgroundColor = MaterialTheme.colors.primary
  )
}