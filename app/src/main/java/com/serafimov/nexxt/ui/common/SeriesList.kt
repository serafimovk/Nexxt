package com.serafimov.nexxt.ui.common

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.serafimov.nexxt.ui.model.SeriesUiModel
import com.serafimov.nexxt.ui.theme.Dimens

@Composable
fun SeriesList(seriesList: List<SeriesUiModel>) {
  LazyColumn(
    modifier = Modifier.fillMaxSize(),
    contentPadding = PaddingValues(Dimens.spacingMedium)
  ) {
    items(seriesList) { seriesUiModel ->
      SeriesItem(seriesUiModel = seriesUiModel)
    }
  }
}