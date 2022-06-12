package com.serafimov.nexxt.ui.screens.nextepisodes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.serafimov.nexxt.data.mockNextEpisodesList
import com.serafimov.nexxt.ui.model.SeriesUiModel

class NextEpisodesViewModel: ViewModel() {

  private val _seriesList = MutableLiveData<List<SeriesUiModel>>()
  val seriesList: LiveData<List<SeriesUiModel>> = _seriesList

  init {
    _seriesList.postValue(mockNextEpisodesList)
  }

}