package com.serafimov.nexxt.ui.screens.discover

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.serafimov.nexxt.ui.common.SeriesList
import com.serafimov.nexxt.ui.screens.discover.appbar.SearchAppBar
import com.serafimov.nexxt.ui.screens.discover.appbar.SearchViewVisibility

@Composable
fun DiscoverSeriesScreen(viewModel: DiscoverSeriesViewModel) {

  val searchViewVisibility by viewModel.searchViewVisibility
  val searchQuery by viewModel.searchQuery

  Scaffold(
    topBar = {
      SearchAppBar(
        searchViewVisibility = searchViewVisibility,
        searchQuery = searchQuery,
        onSearchActionClicked = {
          viewModel.updateSearchViewVisibility(SearchViewVisibility.VISIBLE)
        },
        onTextChanged = { newValue ->
          viewModel.updateSearchQuery(newValue)
        },
        performSearch = { },
        onCloseClicked = {
          viewModel.updateSearchViewVisibility(SearchViewVisibility.GONE)
        }
      )
    }
  ) {
    SeriesList(seriesList = viewModel.seriesList.value.orEmpty())
  }
}
