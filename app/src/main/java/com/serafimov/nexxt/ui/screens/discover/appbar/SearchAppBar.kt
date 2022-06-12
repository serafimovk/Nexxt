package com.serafimov.nexxt.ui.screens.discover.appbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import com.serafimov.nexxt.R
import com.serafimov.nexxt.ui.common.AppBarIcon
import com.serafimov.nexxt.ui.theme.Dimens

@Composable
fun SearchAppBar(
  searchViewVisibility: SearchViewVisibility,
  searchQuery: String,
  onSearchActionClicked: () -> Unit,
  onTextChanged: (String) -> Unit,
  performSearch: (String) -> Unit,
  onCloseClicked: () -> Unit
) {
  when (searchViewVisibility) {
    SearchViewVisibility.GONE -> {
      AppBar(onSearchActionClicked = onSearchActionClicked)
    }
    SearchViewVisibility.VISIBLE -> {
      SearchView(
        searchQuery = searchQuery,
        onTextChanged = onTextChanged,
        performSearch = performSearch,
        onCloseClicked = onCloseClicked
      )
    }
  }
}

@Composable
private fun AppBar(onSearchActionClicked: () -> Unit) {
  TopAppBar(
    title = {
      Text(
        text = stringResource(id = R.string.app_name),
        color = MaterialTheme.colors.onPrimary
      )
    },
    navigationIcon = { AppBarIcon() },
    actions = {
      IconButton(onClick = { onSearchActionClicked() }) {
        Icon(
          imageVector = Icons.Filled.Search,
          contentDescription = null,
          tint = MaterialTheme.colors.onPrimary
        )
      }
    },
    backgroundColor = MaterialTheme.colors.primary
  )
}

@Composable
private fun SearchView(
  searchQuery: String,
  onTextChanged: (String) -> Unit,
  performSearch: (String) -> Unit,
  onCloseClicked: () -> Unit
) {
  val onTrailingIconClicked: () -> Unit = {
    if (searchQuery.isNotEmpty()) {
      onTextChanged("")
    } else {
      onCloseClicked()
    }
  }

  Surface(
    modifier = Modifier
      .fillMaxWidth()
      .height(Dimens.appBarHeight),
    color = MaterialTheme.colors.primary
  ) {
    TextField(
      value = searchQuery,
      onValueChange = { onTextChanged(it) },
      modifier = Modifier.fillMaxWidth(),
      textStyle = MaterialTheme.typography.subtitle1,
      placeholder = {
        Text(
          text = stringResource(R.string.hint_search),
          modifier = Modifier.alpha(ContentAlpha.medium),
          color = Color.White
        )
      },
      leadingIcon = {
        Icon(
          imageVector = Icons.Filled.Search,
          contentDescription = "Search Icon",
          modifier = Modifier.alpha(ContentAlpha.medium),
          tint = MaterialTheme.colors.onPrimary
        )
      },
      trailingIcon = {
        IconButton(onClick = { onTrailingIconClicked() }) {
          Icon(
            imageVector = Icons.Filled.Close,
            contentDescription = "Close Icon",
            tint = MaterialTheme.colors.onPrimary
          )
        }
      },
      keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
      keyboardActions = KeyboardActions(onSearch = { performSearch(searchQuery) }),
      singleLine = true,
      colors = TextFieldDefaults.textFieldColors(
        backgroundColor = Color.Transparent,
        cursorColor = MaterialTheme.colors.onPrimary.copy(alpha = ContentAlpha.medium)
      )
    )
  }
}