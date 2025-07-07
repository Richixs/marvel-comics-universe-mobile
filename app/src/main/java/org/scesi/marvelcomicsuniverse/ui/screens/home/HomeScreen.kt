package org.scesi.marvelcomicsuniverse.ui.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.scesi.marvelcomicsuniverse.ui.marvel.components.CharacterItem
import org.scesi.marvelcomicsuniverse.ui.marvel.components.ComicItem
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.ui.text.font.FontWeight
import kotlin.math.absoluteValue

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
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                val pagerState = rememberPagerState(pageCount = { comics.size })
                HorizontalPager(
                    state = pagerState,
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp)
                ) { page ->
                    val pageOffset =
                        (pagerState.currentPage - page) + pagerState.currentPageOffsetFraction
                    val scale = 1f - pageOffset.absoluteValue * 0.25f
                    ComicItem(
                        comic = comics[page],
                        modifier = Modifier
                            .graphicsLayer {
                                val pageOffset =
                                    (pagerState.currentPage - page) + pagerState.currentPageOffsetFraction
                                translationX = pageOffset * (180.dp.toPx())
                                alpha = 1f - pageOffset.absoluteValue.coerceIn(0f, 1f)
                                val scale = 1f - pageOffset.absoluteValue * 0.3f
                                scaleX = scale
                                scaleY = scale
                                rotationZ = pageOffset * 15f
                            }
                    )
                }
            }
        }
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