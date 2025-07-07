package org.scesi.marvelcomicsuniverse.ui.marvel.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import org.scesi.marvelcomicsuniverse.data.remote.model.Comic

@Composable
fun ComicItem(comic: Comic, modifier: Modifier = Modifier) {
    val imagePath = comic.thumbnail?.path?.replace("http", "https")
    Box(modifier = modifier.fillMaxSize()) {
        AsyncImage(
            model = "$imagePath.${comic.thumbnail?.extension}",
            contentDescription = comic.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(300.dp)
                .height(400.dp)
                .clip(RoundedCornerShape(16.dp))
                .align(Alignment.Center)
        )
    }
}