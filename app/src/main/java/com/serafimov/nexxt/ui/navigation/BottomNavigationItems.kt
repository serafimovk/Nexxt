package com.serafimov.nexxt.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import com.serafimov.nexxt.R

val BottomNavigationItems = listOf(
  BottomNavigationItem(
    R.string.tab_discover,
    Icons.Filled.Search,
    ROUTE_DISCOVER
  ),
  BottomNavigationItem(
    R.string.tab_next_episodes,
    Icons.Filled.Movie,
    ROUTE_NEXT_EPISODES
  ),
  BottomNavigationItem(
    R.string.tab_settings,
    Icons.Filled.Settings,
    ROUTE_SETTINGS
  )
)