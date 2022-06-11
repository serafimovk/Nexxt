package com.serafimov.nexxt.ui.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.serafimov.nexxt.R
import com.serafimov.nexxt.ui.model.SeriesUiModel
import com.serafimov.nexxt.ui.theme.Dimens
import com.serafimov.nexxt.ui.theme.buttonPrimaryBackground
import com.serafimov.nexxt.ui.theme.buttonSecondaryBackground
import com.serafimov.nexxt.ui.theme.textButton

@Composable
fun SeriesItem(seriesUiModel: SeriesUiModel) {
  Card(
    modifier = Modifier
      .padding(Dimens.spacingMedium)
      .fillMaxWidth(),
    shape = MaterialTheme.shapes.large,
    elevation = Dimens.cardElevation
  ) {
    Row {
      PosterImage(imageId = seriesUiModel.imageResource)
      Column(modifier = Modifier.padding(Dimens.spacingLarge)) {
        TitleText(seriesUiModel.title)
        HorizontalSpacer(Dimens.spacingMedium)
        BodyText(
          stringResource(
            id = R.string.label_next_episode,
            seriesUiModel.nextEpisode.orEmpty()
          )
        )
        BodyText(
          stringResource(
            id = R.string.label_airs_in,
            seriesUiModel.airsIn.orEmpty()
          )
        )
        HorizontalSpacer(Dimens.spacingSmall)
        Button(
          onClick = { },
          modifier = Modifier.fillMaxWidth(),
          colors = ButtonDefaults.buttonColors(getButtonBackground(seriesUiModel.notifyMe))
        ) {
          Text(
            text = getButtonText(seriesUiModel.notifyMe),
            color = MaterialTheme.colors.textButton
          )
        }
      }
    }
  }
}

@Composable
private fun getButtonText(shouldNotify: Boolean): String {
  return if (shouldNotify) {
    stringResource(id = R.string.button_stop_notifying)
  } else {
    stringResource(id = R.string.button_notify_me)
  }
}

@Composable
private fun getButtonBackground(shouldNotify: Boolean): Color {
  return if (shouldNotify) {
    MaterialTheme.colors.buttonSecondaryBackground
  } else {
    MaterialTheme.colors.buttonPrimaryBackground
  }
}