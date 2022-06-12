package com.serafimov.nexxt.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.serafimov.nexxt.ui.navigation.AppNavigation
import com.serafimov.nexxt.ui.navigation.BottomNavigationBar
import com.serafimov.nexxt.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      val navController = rememberNavController()
      AppTheme {
        Scaffold(
          modifier = Modifier.fillMaxSize(),
          content = { padding ->
            AppNavigation(
              navController = navController,
              modifier = Modifier.padding(padding)
            )
          },
          bottomBar = {
            BottomNavigationBar(navController = navController)
          }
        )
      }
    }
  }

}
