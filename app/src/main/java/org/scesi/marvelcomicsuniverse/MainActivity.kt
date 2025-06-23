package org.scesi.marvelcomicsuniverse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import org.scesi.marvelcomicsuniverse.ui.components.BottomBarNav
import org.scesi.marvelcomicsuniverse.ui.components.TopBar
import org.scesi.marvelcomicsuniverse.ui.theme.MarvelComicsUniverseTheme
import org.scesi.marvelcomicsuniverse.ui.navigation.Navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            MarvelComicsUniverseTheme {
                Scaffold(
                    topBar = { TopBar() },
                    bottomBar = { BottomBarNav(navController) }
                ) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        Navigation(navController)
                    }
                }
            }
        }
    }
}