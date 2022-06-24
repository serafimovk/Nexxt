package com.serafimov.nexxt.data.repository

import com.serafimov.nexxt.data.model.SeriesModel

interface DiscoverSeriesRepository {

  fun getSeries(): List<SeriesModel>

}