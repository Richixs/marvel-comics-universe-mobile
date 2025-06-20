package org.scesi.marvelcomicsuniverse.ui.screens.download

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.scesi.marvelcomicsuniverse.ui.theme.MarvelComicsUniverseTheme

@Composable
fun DownloadScreen() {
    MarvelComicsUniverseTheme {
        Scaffold { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "DownloadScreen")
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DownloadScreenPreview() {
    DownloadScreen()
}