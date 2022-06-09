package com.serafimov.nexxt.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.serafimov.nexxt.R
import com.serafimov.nexxt.ui.navigation.AppNavigation
import com.serafimov.nexxt.ui.navigation.BottomNavigationBar
import com.serafimov.nexxt.ui.theme.NexxtTheme

class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      val navController = rememberNavController()
      NexxtTheme {
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colors.background
        ) {
          Scaffold(
            topBar = { TopAppBar(title = { Text(stringResource(R.string.app_name)) }) },
            content = { AppNavigation(navController = navController) },
            bottomBar = { BottomNavigationBar(navController = navController) }
          )
        }
      }
    }
  }

}
