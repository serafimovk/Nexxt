package com.serafimov.nexxt.ui.screens.nextepisodes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.serafimov.nexxt.data.model.SeriesModel
import com.serafimov.nexxt.data.repository.NextEpisodesRepository

class NextEpisodesViewModel(repository: NextEpisodesRepository): ViewModel() {

  private val _seriesList = MutableLiveData<List<SeriesModel>>()
  val seriesList: LiveData<List<SeriesModel>> = _seriesList

  init {
    _seriesList.postValue(repository.getNextEpisodes())
  }

}