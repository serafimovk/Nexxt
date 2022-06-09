package com.serafimov.nexxt.ui.navigation

sealed class AppDestinations(val route: String) {
  object DiscoverScreen : AppDestinations(ROUTE_DISCOVER)
  object NextEpisodesScreen : AppDestinations(ROUTE_NEXT_EPISODES)
  object SettingsScreen : AppDestinations(ROUTE_SETTINGS)
}

const val ROUTE_DISCOVER = "discover"
const val ROUTE_NEXT_EPISODES = "next-episodes"
const val ROUTE_SETTINGS = "settings"