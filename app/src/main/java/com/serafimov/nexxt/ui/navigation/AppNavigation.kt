package com.serafimov.nexxt.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.serafimov.nexxt.ui.screens.discover.DiscoverScreen
import com.serafimov.nexxt.ui.screens.nextepisodes.NextEpisodesScreen
import com.serafimov.nexxt.ui.screens.settings.SettingsScreen

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier) {

  NavHost(
    navController = navController,
    startDestination = AppDestinations.NextEpisodesScreen.route,
    modifier = modifier
  ) {

    composable(AppDestinations.DiscoverScreen.route) {
      DiscoverScreen()
    }

    composable(AppDestinations.NextEpisodesScreen.route) {
      NextEpisodesScreen()
    }

    composable(AppDestinations.SettingsScreen.route) {
      SettingsScreen()
    }

  }

}