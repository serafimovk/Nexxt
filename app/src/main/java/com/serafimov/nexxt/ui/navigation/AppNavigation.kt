package com.serafimov.nexxt.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.serafimov.nexxt.ui.screens.discover.DiscoverSeriesScreen
import com.serafimov.nexxt.ui.screens.discover.DiscoverSeriesViewModel
import com.serafimov.nexxt.ui.screens.nextepisodes.NextEpisodesScreen
import com.serafimov.nexxt.ui.screens.nextepisodes.NextEpisodesViewModel
import com.serafimov.nexxt.ui.screens.settings.SettingsScreen
import com.serafimov.nexxt.ui.screens.settings.SettingsViewModel
import org.koin.androidx.compose.getViewModel

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier) {

  NavHost(
    navController = navController,
    startDestination = AppDestinations.NextEpisodesScreen.route,
    modifier = modifier
  ) {

    composable(AppDestinations.DiscoverSeriesScreen.route) {
      val viewModel = getViewModel<DiscoverSeriesViewModel>()
      DiscoverSeriesScreen(viewModel)
    }

    composable(AppDestinations.NextEpisodesScreen.route) {
      val viewModel = getViewModel<NextEpisodesViewModel>()
      NextEpisodesScreen(viewModel)
    }

    composable(AppDestinations.SettingsScreen.route) {
      val viewModel = getViewModel<SettingsViewModel>()
      SettingsScreen(viewModel)
    }

  }

}