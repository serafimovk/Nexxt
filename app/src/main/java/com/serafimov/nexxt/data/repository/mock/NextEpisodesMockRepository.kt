package com.serafimov.nexxt.data.repository.mock

import com.serafimov.nexxt.data.repository.NextEpisodesRepository
import com.serafimov.nexxt.data.seriesList

class NextEpisodesMockRepository: NextEpisodesRepository {

  override fun getNextEpisodes() = seriesList.filter { it.notifyMe }

}