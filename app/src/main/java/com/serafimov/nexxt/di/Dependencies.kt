package com.serafimov.nexxt.di

import com.serafimov.nexxt.ui.screens.discover.DiscoverSeriesViewModel
import com.serafimov.nexxt.ui.screens.nextepisodes.NextEpisodesViewModel
import com.serafimov.nexxt.ui.screens.settings.SettingsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val koinModule = module {

  viewModel {
    DiscoverSeriesViewModel()
  }

  viewModel {
    NextEpisodesViewModel()
  }

  viewModel {
    SettingsViewModel()
  }

}