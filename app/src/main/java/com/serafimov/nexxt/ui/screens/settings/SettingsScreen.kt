package com.serafimov.nexxt.ui.screens.settings

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.serafimov.nexxt.R
import com.serafimov.nexxt.ui.common.AppBarIcon

@Composable
fun SettingsScreen(viewModel: SettingsViewModel) {
  Scaffold(
    topBar = { TopAppBar() },
    content = { }
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