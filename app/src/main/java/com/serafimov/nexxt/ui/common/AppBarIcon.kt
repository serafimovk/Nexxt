package com.serafimov.nexxt.ui.common

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Movie
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.serafimov.nexxt.ui.theme.Dimens

@Composable
fun AppBarIcon() {
  Icon(
    imageVector = Icons.Filled.Movie,
    tint = MaterialTheme.colors.onPrimary,
    contentDescription = null,
    modifier = Modifier.padding(
      Dimens.spacingLarge,
      Dimens.noSpacing,
      Dimens.noSpacing,
      Dimens.noSpacing
    )
  )
}