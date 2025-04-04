package com.brayo.harakamall.ui.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.brayo.harakamall.R
import com.brayo.harakamall.navigation.ROUT_LOGIN
import com.brayo.harakamall.ui.theme.neworange
import com.brayo.harakamall.ui.theme.newwhite


@Composable
fun FormScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painter = painterResource(R.drawable.ic_launcher_foreground), contentScale = ContentScale.FillBounds)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(R.drawable.home),
            contentDescription = "home",

            )



        Text(
            text = "CREATE AN ACCOUNT",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        //Variables
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }

        //Fullname
        OutlinedTextField(

            value = fullname,
            onValueChange = {fullname = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person", tint = neworange) },
            label = {Text("Fullname")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Gray,
                focusedLabelColor = neworange,
                unfocusedLabelColor = Color.Black

            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )

        //End of fullname

        Spacer(modifier = Modifier.height(10.dp))
        //USERNAME
        OutlinedTextField(

            value = username,
            onValueChange = {username = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
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
        Spacer(modifier = Modifier.height(10.dp))
        //Email
        OutlinedTextField(

            value = email,
            onValueChange = {email = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Person", tint = neworange) },
            label = {Text("Email Address")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Gray,
                focusedLabelColor = neworange,
                unfocusedLabelColor = Color.Black

            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )

        //End of email
        Spacer(modifier = Modifier.height(10.dp))
        //Password
        OutlinedTextField(

            value = password,
            onValueChange = {password = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
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

        Spacer(modifier = Modifier.height(10.dp))
        //ConfirmPassword
        OutlinedTextField(

            value = confirmpassword,
            onValueChange = {confirmpassword = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Person", tint = neworange) },
            label = {Text("Confirm Password")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Gray,
                focusedLabelColor = neworange,
                unfocusedLabelColor = Color.Black

            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )

        //End of Confirm Password
        Spacer(modifier = Modifier.height(10.dp))
        //Button


        Button(
            onClick = {
                navController.navigate(ROUT_LOGIN)

            },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        ) {
            Text(
                text = "Register",
                color = newwhite
            )
        }
        //End of button















    }


}

@Preview(showBackground = true)
@Composable
fun FormScreenScreenPreview(){
    FormScreen(rememberNavController())


}