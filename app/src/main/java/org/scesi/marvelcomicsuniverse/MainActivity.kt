package org.scesi.marvelcomicsuniverse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.compose.rememberNavController
import org.scesi.marvelcomicsuniverse.ui.components.BottomBarNav
import org.scesi.marvelcomicsuniverse.ui.components.TopBar
import org.scesi.marvelcomicsuniverse.ui.theme.MarvelComicsUniverseTheme
import org.scesi.marvelcomicsuniverse.ui.navigation.Navigation

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())

            MarvelComicsUniverseTheme {
                Scaffold(
                    modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
                    topBar = { TopBar(scrollBehavior = scrollBehavior) },
                    bottomBar = { BottomBarNav(navController) }
                ) { innerPadding ->
                    Box(
                        modifier = Modifier.padding(
                            top = innerPadding.calculateTopPadding(),
                            bottom = innerPadding.calculateBottomPadding() / 2
                        )
                    ) {
                        Navigation(navController)
                    }
                }
            }
        }
    }
}