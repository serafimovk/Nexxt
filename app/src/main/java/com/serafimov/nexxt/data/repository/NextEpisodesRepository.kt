package com.serafimov.nexxt.data.repository

import com.serafimov.nexxt.data.model.SeriesModel

interface NextEpisodesRepository {

  fun getNextEpisodes(): List<SeriesModel>

}