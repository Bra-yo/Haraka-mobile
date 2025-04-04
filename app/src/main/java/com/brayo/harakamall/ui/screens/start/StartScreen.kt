package com.brayo.harakamall.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.brayo.harakamall.R
import com.brayo.harakamall.navigation.ROUT_ITEM
import com.brayo.harakamall.navigation.ROUT_LOGIN
import com.brayo.harakamall.navigation.ROUT_REGISTER
import com.brayo.harakamall.ui.theme.neworange

@Composable
fun StartScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


    )

    {
        Text(text = "HarakaMall",

            fontSize = 30.sp

        )
        Spacer(modifier = Modifier.height(20.dp))
        // Circular Image

        Image(painter = painterResource(R.drawable.mall),
            contentDescription = "start",
            modifier = Modifier.size(300.dp, 200.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        //End

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Find Your Order",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = neworange
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Enter eCommerce automation. With Zapier, you can connect everything from project management tools to online payment solutions to handle everyday manual tasks for you so you can scale your efforts. So, how do you clear out the cobwebs and turn your eCommerce business into a symphony of automation? Let's explore.",
            textAlign = TextAlign.Center,
            fontSize = 15.sp

            )

        Spacer(modifier = Modifier.height(20.dp))



        Button(onClick = {
            navController.navigate(ROUT_LOGIN)
        },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(text = "Get Started")
        }





    }



}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){

    StartScreen(rememberNavController())


}