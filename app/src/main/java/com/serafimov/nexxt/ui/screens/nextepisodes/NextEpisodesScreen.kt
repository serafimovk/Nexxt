package com.serafimov.nexxt.ui.screens.nextepisodes

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.serafimov.nexxt.R
import com.serafimov.nexxt.ui.common.AppBarIcon
import com.serafimov.nexxt.ui.common.SeriesList

@Composable
fun NextEpisodesScreen(viewModel: NextEpisodesViewModel) {
  Scaffold(
    topBar = { TopAppBar() },
    content = {
      SeriesList(seriesList = viewModel.seriesList.value.orEmpty())
    }
  )
}

@Composable
private fun TopAppBar() {
  TopAppBar(
    title = {
      Text(
        text = stringResource(R.string.app_name),
        color = MaterialTheme.colors.onPrimary
      )
    },
    navigationIcon = { AppBarIcon() },
    backgroundColor = MaterialTheme.colors.primary
  )
}