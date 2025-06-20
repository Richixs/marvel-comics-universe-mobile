package org.scesi.marvelcomicsuniverse.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.scesi.marvelcomicsuniverse.ui.theme.MarvelComicsUniverseTheme

@Composable
fun BottomBarNav() {
    NavigationBar(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
            .clip(RoundedCornerShape(24.dp))
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { },
            icon = { })
    }
}

@Composable
@Preview(showBackground = true)
fun BottomBarPreview() {
    MarvelComicsUniverseTheme {
        BottomBarNav()
    }
}