package org.scesi.marvelcomicsuniverse.ui.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.scesi.marvelcomicsuniverse.ui.components.BottomBarNav
import org.scesi.marvelcomicsuniverse.ui.navigation.NavRoutes
import org.scesi.marvelcomicsuniverse.ui.theme.MarvelComicsUniverseTheme

@Composable
fun HomeScreen(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(text = "HomeScreen")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    val navHostController = rememberNavController()
    HomeScreen(navHostController)
}