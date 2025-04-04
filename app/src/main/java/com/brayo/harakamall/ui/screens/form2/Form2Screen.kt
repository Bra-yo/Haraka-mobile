package com.brayo.harakamall.ui.screens.form2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.brayo.harakamall.R
import com.brayo.harakamall.navigation.ROUT_ITEM
import com.brayo.harakamall.ui.theme.blue2
import com.brayo.harakamall.ui.theme.neworange
import com.brayo.harakamall.ui.theme.newwhite
import com.brayo.harakamall.ui.theme.newwhite

@Composable
fun Form2Screen(navController: NavController){


    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(blue2)



    ){
        Spacer(modifier = Modifier.height(40.dp))
        Row(
            Modifier.padding(start = 80.dp,end = 80.dp)



        ) {

            Image(
                painter = painterResource(R.drawable.home),
                contentDescription = "home",
                modifier = Modifier.width(40.dp).height(40.dp)

            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Logo App",
                color = newwhite,
                fontSize = 30.sp,

                )
        }
        //End of Row
        Spacer(modifier = Modifier.height(20.dp))
        Image(

            painter = painterResource(R.drawable.mall),
            contentDescription = "home",
            modifier = Modifier
                .fillMaxWidth()
                .size(200.dp)


            ,


            )
        Spacer(modifier = Modifier.height(30.dp))
        Card( modifier = Modifier.fillMaxWidth().height(600.dp),
            shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),


            colors = CardDefaults.cardColors(newwhite)
        ){
            Spacer(modifier = Modifier.height(30.dp))

            Text(modifier = Modifier.padding(start = 40.dp, end = 40.dp),
                text = "The Most Worth Grocery App ",
                fontWeight = FontWeight.Bold,

                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                color = neworange




            )

            Spacer(modifier = Modifier.height(20.dp))
            //Variables

            var username by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }
            Spacer(modifier = Modifier.height(10.dp))
            //USERNAME
            OutlinedTextField(

                value = username,
                onValueChange = {username = it},
                modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
                shape = RoundedCornerShape(30.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Person", tint = neworange) },
                label = {Text("Username")},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Gray,
                    focusedLabelColor = neworange,
                    unfocusedLabelColor = Color.Black

                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )

            //End of USERNAME
            Spacer(modifier = Modifier.height(20.dp))
            //Password
            OutlinedTextField(

                value = password,
                onValueChange = {password = it},
                modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
                shape = RoundedCornerShape(30.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Person", tint = neworange) },
                label = {Text("Password")},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Gray,
                    focusedLabelColor = neworange,
                    unfocusedLabelColor = Color.Black

                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()

            )

            //End of Password
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                onClick = { navController.navigate(ROUT_ITEM)

                },
                colors = ButtonDefaults.buttonColors(neworange),
                shape = RoundedCornerShape(size = 30.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
            ) {
                Text(
                    text = "Sign Up",
                    color = newwhite
                )
            }
            //End of button

            Spacer(modifier = Modifier.height(20.dp))

            Text(modifier = Modifier.padding(start = 40.dp, end = 40.dp),
                text = "Already a member?",
                fontSize = 20.sp,

                color = Color.DarkGray

            )














        }




    }
















}

@Preview(showBackground = true)
@Composable
fun Form2ScreenPreview(){
    Form2Screen(rememberNavController())


}