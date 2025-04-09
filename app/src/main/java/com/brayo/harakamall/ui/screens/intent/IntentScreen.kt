package com.brayo.harakamall.ui.screens.intent

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.brayo.harakamall.navigation.ROUT_ITEM
import com.brayo.harakamall.ui.theme.Orange
import com.brayo.harakamall.ui.theme.neworange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {


        //TopAppBar
        TopAppBar(
            title = {
                Text(
                    text = "Intents",
                    color = Color.White,
                )

            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Orange,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White,
            ),
            navigationIcon = {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Icon Menu",
                    )
                }
            },

            actions = {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "Share",
                    )
                }
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Settings",
                    )
                }
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Arrow",
                    )
                }


            }

        )
        //End of TopApp bar

        val mContext = LocalContext.current

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            Spacer(modifier = Modifier.height(20.dp))

            //STK

            Button(onClick = {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

            },
                colors = ButtonDefaults.buttonColors(neworange),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp )

            ) {
                Text(text = "Mpesa")
            }

            Spacer(modifier = Modifier.height(20.dp))

            //Call

            Button(onClick = {
                val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0712564288".toUri()
                mContext.startActivity(callIntent)

            },
                colors = ButtonDefaults.buttonColors(neworange),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp )

            ) {
                Text(text = "Call Us")
            }

            Spacer(modifier = Modifier.height(20.dp))

            //Email

            Button(onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("mutukubrian348@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello Engineer Mutuku, this is my review about your app")
                mContext.startActivity(shareIntent)

            },
                colors = ButtonDefaults.buttonColors(neworange),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp )

            ) {
                Text(text = "Send an Email")
            }

            Spacer(modifier = Modifier.height(20.dp))

            //Share

            Button(onClick = {
                val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

            },
                colors = ButtonDefaults.buttonColors(neworange),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp )

            ) {
                Text(text = "Share")
            }

            Spacer(modifier = Modifier.height(20.dp))

            //Sms

            Button(onClick = {
                val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0712564288".toUri()
                smsIntent.putExtra("sms_body","Hello Haraka Mall,I'm interested in this product")
                mContext.startActivity(smsIntent)

            },
                colors = ButtonDefaults.buttonColors(neworange),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp )

            ) {
                Text(text = "Send an SMS")
            }

            Spacer(modifier = Modifier.height(20.dp))

            //Camera

            Button(onClick = {
                val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }


            },
                colors = ButtonDefaults.buttonColors(neworange),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp )

            ) {
                Text(text = "Take a Photo")
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(rememberNavController())


}