package com.serafimov.nexxt.ui.model

data class SeriesUiModel(
  val id: String,
  val title: String,
  val imageResource: Int,
  val nextEpisode: String? = null,
  val airsIn: String? = null,
  val notifyMe: Boolean = false
)