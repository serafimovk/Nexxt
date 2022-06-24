package com.serafimov.nexxt.data.repository.mock

import com.serafimov.nexxt.data.repository.DiscoverSeriesRepository
import com.serafimov.nexxt.data.seriesList

class DiscoverSeriesMockRepository: DiscoverSeriesRepository {

  override fun getSeries() = seriesList

}