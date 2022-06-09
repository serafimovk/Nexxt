package com.serafimov.nexxt.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
  val titleResource: Int,
  val image: ImageVector,
  val route: String
)