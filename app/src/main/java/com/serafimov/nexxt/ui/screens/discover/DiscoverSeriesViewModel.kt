package com.serafimov.nexxt.ui.screens.discover

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.serafimov.nexxt.data.mockDiscoverSeriesList
import com.serafimov.nexxt.ui.screens.discover.appbar.SearchViewVisibility
import com.serafimov.nexxt.ui.model.SeriesUiModel

class DiscoverSeriesViewModel : ViewModel() {

  private val _searchViewVisibility = mutableStateOf(SearchViewVisibility.GONE)
  val searchViewVisibility: State<SearchViewVisibility> = _searchViewVisibility

  private val _searchQuery = mutableStateOf("")
  val searchQuery: State<String> = _searchQuery

  private val _seriesList = MutableLiveData<List<SeriesUiModel>>()
  val seriesList: LiveData<List<SeriesUiModel>> = _seriesList

  init {
    _seriesList.postValue(mockDiscoverSeriesList)
  }

  fun updateSearchViewVisibility(newValue: SearchViewVisibility) {
    _searchViewVisibility.value = newValue
  }

  fun updateSearchQuery(newValue: String) {
    _searchQuery.value = newValue
  }

}