package org.scesi.marvelcomicsuniverse.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import org.scesi.marvelcomicsuniverse.ui.navigation.NavRoutes

enum class BottomBarNavItem(
    val navRoute: String,
    val icon: ImageVector,
    val route: String
) {
    HOME(
        navRoute = NavRoutes.HOME_SCREEN,
        icon = Icons.Filled.Home,
        route = "Home"
    ),
    SEARCH(
        navRoute = NavRoutes.SEARCH_SCREEN,
        icon = Icons.Filled.Search,
        route = "Search"
    ),
    FAVORITES(
        navRoute = NavRoutes.FAVORITES_SCREEN,
        icon = Icons.Filled.Favorite,
        route = "Favorites"
    ),
    PROFILE(
        navRoute = NavRoutes.PROFILE_SCREEN,
        icon = Icons.Filled.Person,
        route = "Profile"
    )
}

val bottomBarNavItems = listOf(
    BottomBarNavItem.HOME,
    BottomBarNavItem.SEARCH,
    BottomBarNavItem.FAVORITES,
    BottomBarNavItem.PROFILE,
)