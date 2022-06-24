package com.serafimov.nexxt.di

import com.serafimov.nexxt.data.repository.DiscoverSeriesRepository
import com.serafimov.nexxt.data.repository.mock.DiscoverSeriesMockRepository
import com.serafimov.nexxt.data.repository.mock.NextEpisodesMockRepository
import com.serafimov.nexxt.data.repository.NextEpisodesRepository
import com.serafimov.nexxt.ui.screens.discover.DiscoverSeriesViewModel
import com.serafimov.nexxt.ui.screens.nextepisodes.NextEpisodesViewModel
import com.serafimov.nexxt.ui.screens.settings.SettingsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val koinModule = module {

  viewModel {
    DiscoverSeriesViewModel(get())
  }

  viewModel {
    NextEpisodesViewModel(get())
  }

  viewModel {
    SettingsViewModel()
  }

  single<NextEpisodesRepository> {
    NextEpisodesMockRepository()
  }

  single<DiscoverSeriesRepository> {
    DiscoverSeriesMockRepository()
  }

}