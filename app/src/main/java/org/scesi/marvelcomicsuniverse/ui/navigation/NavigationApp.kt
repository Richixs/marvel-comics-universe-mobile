package org.scesi.marvelcomicsuniverse.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.scesi.marvelcomicsuniverse.ui.screens.download.DownloadScreen
import org.scesi.marvelcomicsuniverse.ui.screens.favorites.FavoritesScreen
import org.scesi.marvelcomicsuniverse.ui.screens.home.HomeScreen
import org.scesi.marvelcomicsuniverse.ui.screens.profile.ProfileScreen
import org.scesi.marvelcomicsuniverse.ui.screens.search.SearchScreen

@Composable
fun Navigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = NavRoutes.HOME_SCREEN
    ) {
        composable(NavRoutes.HOME_SCREEN) {
            HomeScreen(navHostController)
        }

        composable(NavRoutes.SEARCH_SCREEN) {
            SearchScreen(navHostController)
        }

        composable(NavRoutes.FAVORITES_SCREEN) {
            FavoritesScreen(navHostController)
        }

        composable(NavRoutes.PROFILE_SCREEN) {
            ProfileScreen(navHostController)
        }

        composable(NavRoutes.DOWNLOAD_SCREEN) {
            DownloadScreen(navHostController)
        }
    }
}