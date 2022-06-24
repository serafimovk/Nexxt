package com.serafimov.nexxt.data

import com.serafimov.nexxt.R
import com.serafimov.nexxt.data.model.SeriesModel

val seriesList = listOf(
  SeriesModel(
    id = "1",
    title = "Obi-Wan Kenobi",
    imageResource = R.drawable.mock_poster_1,
    nextEpisode = "5",
    airsIn = "5 days 13 hours",
    notifyMe = true
  ),
  SeriesModel(
    id = "1",
    title = "Ms Marvel",
    imageResource = R.drawable.mock_poster_2,
    nextEpisode = "2",
    airsIn = "2 days 5 hours",
    notifyMe = false
  ),
  SeriesModel(
    id = "1",
    title = "The Boys",
    imageResource = R.drawable.mock_poster_3,
    nextEpisode = "7",
    airsIn = "4 days 2 hours",
    notifyMe = false
  ),
  SeriesModel(
    id = "1",
    title = "Peaky Blinders",
    imageResource = R.drawable.mock_poster_4,
    nextEpisode = "13",
    airsIn = "19 hours",
    notifyMe = true
  ),
  SeriesModel(
    id = "1",
    title = "Grey's Anatomy",
    imageResource = R.drawable.mock_poster_5,
    nextEpisode = "78",
    airsIn = "3 days 12 hours",
    notifyMe = false
  )
)