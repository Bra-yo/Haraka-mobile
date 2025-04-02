package com.brayo.harakamall.ui.screens.items

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.brayo.harakamall.R
import com.brayo.harakamall.ui.theme.Gold
import com.brayo.harakamall.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        //TopAppBar
        TopAppBar(
            title = {
                Text(
                    text = "Products",
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
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Shopping Cart Menu",
                    )
                }
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                    )
                }
            }

        )
        //End

        Image(
            painter = painterResource(R.drawable.mall),
            contentDescription = "Mall",
            modifier = Modifier.fillMaxWidth().clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.FillWidth,
        )

        Spacer(modifier = Modifier.height(20.dp))

        //SearchBar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = ""
                )
            },

            placeholder = {
                Text(
                    text = "Search here..."
                )
            }

        )
        //EndSearch

        Spacer(modifier = Modifier.height(20.dp))

        //Row
        Row (
            modifier = Modifier.padding(start = 20.dp)
        ){
            Image(
                painter = painterResource(R.drawable.mall),
                contentDescription = "",
                modifier = Modifier.width(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth,
            )

            Spacer(modifier = Modifier.width(5.dp))

            Column (
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(
                    text = "Shopping Mall Space",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp)

                )

                Text(
                    text = "Casual Wear",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "Ksh 2, 000",
                    fontSize = 10.sp,
                    textDecoration = TextDecoration.LineThrough,
                )

                Text(
                    text = "Price: Ksh 1, 800",
                    fontSize = 10.sp,

                    )

                Row (){
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                }
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth().padding(end = 40.dp).height(35.dp),
                    colors = ButtonDefaults.buttonColors(Orange),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(
                        text = "Contact Us",
                    )
                }


            }


        }//EndRow

        //Row
        Row (
            modifier = Modifier.padding(start = 20.dp)
        ){
            Image(
                painter = painterResource(R.drawable.mall),
                contentDescription = "",
                modifier = Modifier.width(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth,
            )

            Spacer(modifier = Modifier.width(5.dp))

            Column (
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(
                    text = "Shopping Mall Space",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp)

                )

                Text(
                    text = "Casual Wear",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "Ksh 2, 000",
                    fontSize = 10.sp,
                    textDecoration = TextDecoration.LineThrough,
                )

                Text(
                    text = "Price: Ksh 1, 800",
                    fontSize = 10.sp,

                    )

                Row (){
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                }
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth().padding(end = 40.dp).height(35.dp),
                    colors = ButtonDefaults.buttonColors(Orange),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(
                        text = "Contact Us",
                    )
                }


            }


        }//EndRow

        Spacer(modifier = Modifier.height(20.dp))

        //Row
        Row (
            modifier = Modifier.padding(start = 20.dp)
        ){
            Image(
                painter = painterResource(R.drawable.mall),
                contentDescription = "",
                modifier = Modifier.width(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth,
            )

            Spacer(modifier = Modifier.width(5.dp))

            Column () {
                Text(
                    text = "Shopping Mall Space",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp)

                )

                Text(
                    text = "Casual Wear",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "Ksh 2, 000",
                    fontSize = 10.sp,
                    textDecoration = TextDecoration.LineThrough,
                )

                Text(
                    text = "Price: Ksh 1, 800",
                    fontSize = 10.sp,

                    )

                Row (){
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = Gold,
                    )
                }
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth().padding(end = 40.dp).height(35.dp),
                    colors = ButtonDefaults.buttonColors(Orange),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(
                        text = "Contact Us",
                    )
                }


            }


        }//EndRow



    }
}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(rememberNavController())
}