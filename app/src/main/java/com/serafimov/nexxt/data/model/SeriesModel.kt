package com.serafimov.nexxt.data.model

data class SeriesModel(
  val id: String,
  val title: String,
  val imageResource: Int,
  val nextEpisode: String? = null,
  val airsIn: String? = null,
  val notifyMe: Boolean = false
)