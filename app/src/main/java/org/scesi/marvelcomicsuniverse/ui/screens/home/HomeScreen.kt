package org.scesi.marvelcomicsuniverse.ui.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.scesi.marvelcomicsuniverse.ui.marvel.components.CharacterItem
import org.scesi.marvelcomicsuniverse.ui.marvel.components.ComicItem
import androidx.compose.ui.text.font.FontWeight

@Composable
fun HomeScreen(
    navHostController: NavHostController,
    viewModel: HomeScreenViewModel = viewModel()
) {
    val comics by viewModel.comics.collectAsState()
    val characters by viewModel.characters.collectAsState()

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 56.dp)
    ) {
        item {
            Text(
                text = "Characters",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp)
            )
        }

        item {
            LazyRow(
                modifier = Modifier.fillMaxWidth()
            ) {
                items(characters) { character ->
                    CharacterItem(character = character)
                }
            }
        }

        item {
            Text(
                text = "Comics",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp)
            )
        }

        items(comics.chunked(2)) { rowItems ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                for (comic in rowItems) {
                    Box(modifier = Modifier.weight(1f)) {
                        ComicItem(comic = comic)
                    }
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    val navHostController = rememberNavController()
    HomeScreen(navHostController)
}