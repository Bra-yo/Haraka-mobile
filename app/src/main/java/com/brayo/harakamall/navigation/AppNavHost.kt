package com.brayo.harakamall.navigation

import androidx.annotation.RequiresApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.brayo.harakamall.data.UserDatabase
import com.brayo.harakamall.repository.UserRepository
import com.brayo.harakamall.ui.screens.about.AboutScreen
import com.brayo.harakamall.ui.screens.auth.LoginScreen
import com.brayo.harakamall.ui.screens.auth.RegisterScreen
import com.brayo.harakamall.ui.screens.contact.ContactScreen
import com.brayo.harakamall.ui.screens.dashboard.DashboardScreen
import com.brayo.harakamall.ui.screens.form.FormScreen
import com.brayo.harakamall.ui.screens.form2.Form2Screen
import com.brayo.harakamall.ui.screens.home.HomeScreen
import com.brayo.harakamall.ui.screens.intent.IntentScreen
import com.brayo.harakamall.ui.screens.items.ItemScreen
import com.brayo.harakamall.ui.screens.splash.SplashScreen
import com.brayo.harakamall.ui.screens.start.StartScreen
import com.brayo.harakamall.viewmodel.AuthViewModel

@OptIn(ExperimentalMaterial3Api::class)




@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    val context = LocalContext.current

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
        composable (ROUT_SPLASH){
            SplashScreen(navController)

        }



        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }




    }
}