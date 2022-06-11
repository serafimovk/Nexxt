package com.serafimov.nexxt.ui.screens.nextepisodes

import androidx.compose.runtime.Composable
import com.serafimov.nexxt.data.mockNextEpisodesList
import com.serafimov.nexxt.ui.common.SeriesList

@Composable
fun NextEpisodesScreen() {
  SeriesList(seriesList = mockNextEpisodesList)
}