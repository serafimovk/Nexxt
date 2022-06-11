package com.serafimov.nexxt.ui.screens.discover

import androidx.compose.runtime.Composable
import com.serafimov.nexxt.data.mockDiscoverSeriesList
import com.serafimov.nexxt.ui.common.SeriesList

@Composable
fun DiscoverSeriesScreen() {
  SeriesList(seriesList = mockDiscoverSeriesList)
}
