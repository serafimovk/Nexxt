package com.serafimov.nexxt.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.serafimov.nexxt.ui.theme.Dimens

@Composable
fun PosterImage(imageId: Int) {
  Image(
    painter = painterResource(imageId),
    contentDescription = null,
    modifier = Modifier
      .width(Dimens.posterWidth)
      .height(Dimens.posterHeight),
    contentScale = ContentScale.Crop
  )
}