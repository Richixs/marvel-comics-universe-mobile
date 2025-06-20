package org.scesi.marvelcomicsuniverse.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.scesi.marvelcomicsuniverse.ui.screens.download.DownloadScreen
import org.scesi.marvelcomicsuniverse.ui.screens.home.HomeScreen

@Composable
fun Navigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = NavRoutes.HOME_SCREEN
    ) {
        composable(NavRoutes.HOME_SCREEN) {
            HomeScreen(navHostController)
        }
        composable(NavRoutes.DOWNLOAD_SCREEN) {
            DownloadScreen(navHostController)
        }
    }
}