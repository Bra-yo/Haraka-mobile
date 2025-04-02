package com.brayo.harakamall.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.brayo.harakamall.R

@Composable
fun HomeScreen(navController: NavController){
   Column (
       modifier = Modifier.fillMaxSize()
   ) {
       Text(text = "HarakaMall",
           fontSize = 30.sp,
           textAlign = TextAlign.Center,
           color = Color.Magenta,
           fontWeight = FontWeight.ExtraBold
       )

       Image(painter = painterResource(R.drawable.home),
           contentDescription = "home"
           )
       Text(text = "Welcome & enjoy shopping with us...",
           fontSize = 15.sp,
           color = Color.Blue,
           fontStyle = FontStyle.Italic
       )
       Text(text = "Enter eCommerce automation. With Zapier, you can connect everything from project management tools to online payment solutions to handle everyday manual tasks for you so you can scale your efforts. So, how do you clear out the cobwebs and turn your eCommerce business into a symphony of automation? Let's explore.",
           fontSize = 10.sp,
           color = Color.DarkGray,
           fontStyle = FontStyle.Italic
       )

       Button(onClick = {},
           colors = ButtonDefaults.buttonColors(Color.Magenta),
           shape = RoundedCornerShape(5.dp)

           ) {
           Text(text = "Add To Cart")
       }


   }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){

    HomeScreen(rememberNavController())


}