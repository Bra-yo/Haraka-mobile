package com.brayo.harakamall.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.brayo.harakamall.ui.screens.about.AboutScreen
import com.brayo.harakamall.ui.screens.contact.ContactScreen
import com.brayo.harakamall.ui.screens.dashboard.DashboardScreen
import com.brayo.harakamall.ui.screens.home.HomeScreen
import com.brayo.harakamall.ui.screens.intent.IntentScreen
import com.brayo.harakamall.ui.screens.items.ItemScreen
import com.brayo.harakamall.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_DASHBOARD
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable (ROUT_ITEM){
            ItemScreen(navController)
        }
        composable (ROUT_START){
            StartScreen(navController)

        }
        composable (ROUT_INTENT){
            IntentScreen(navController)

        }
        composable (ROUT_DASHBOARD){
            DashboardScreen(navController)

        }
        composable (ROUT_CONTACT){
            ContactScreen(navController)

        }

    }
}