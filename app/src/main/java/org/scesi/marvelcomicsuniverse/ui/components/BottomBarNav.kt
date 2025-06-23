package org.scesi.marvelcomicsuniverse.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import org.scesi.marvelcomicsuniverse.ui.theme.MarvelComicsUniverseTheme

@Composable
fun BottomBarNav(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
            .clip(RoundedCornerShape(24.dp))
    ) {
        NavigationBar {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route

            bottomBarNavItems.forEach { item ->
                NavigationBarItem(
                    selected = currentRoute == item.navRoute,
                    onClick = {
                        navController.navigate(item.navRoute) {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                    icon = {
                        Icon(imageVector = item.icon, contentDescription = item.route)
                    },
                    label = {
                        Text(text = item.route)
                    }
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun BottomBarPreview() {
    MarvelComicsUniverseTheme {
        BottomBarNav(rememberNavController())
    }
}