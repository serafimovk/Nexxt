package com.serafimov.nexxt.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavHostController) {

  BottomNavigation {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route

    BottomNavigationItems.forEach { navItem ->
      val tabTitle = stringResource(navItem.titleResource)
      BottomNavigationItem(
        selected = currentRoute == navItem.route,
        onClick = {
          navController.navigate(navItem.route) {
            popUpTo(navController.graph.findStartDestination().id) {
              saveState = true
            }
            launchSingleTop = true
            restoreState = true
          }
        },
        icon = {
          Icon(
            imageVector = navItem.image,
            contentDescription = tabTitle,
            modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 4.dp)
          )
        },
        label = {
          Text(tabTitle)
        },
      )
    }

  }

}