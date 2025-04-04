package com.brayo.harakamall.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.brayo.harakamall.R
import com.brayo.harakamall.navigation.ROUT_START
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController) {

    //Navigation
    val coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_START)

    }

    //End of Navigation



    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "",
        )

        Text(
            text = "Haraka Mall",
            color = Color.White,

            )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}