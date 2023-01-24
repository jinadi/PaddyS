package lk.dcs.paddystatistics.ui.views

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun FarmerRegScreen(context: Context, navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Farmer Registration")
                },
                navigationIcon = {
                    IconButton(onClick = {
                        // onclick process
                    }) {
                        Icon(Icons.Default.Menu, "MenuIcon")
                    }
                },
                actions = {
                    IconButton(onClick = {
                        // onclick process
                    }) {
                        Icon(Icons.Default.Add, "MenuIcon")
                    }
                },
               // backgroundColor = MaterialTheme.colors.primary,
                backgroundColor = Color(0xffCAC4D0),
                contentColor = Color.Black,
                elevation = 28.dp
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                /*verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally*/
            ) {
                Text(
                    text = "Content of the page",
                    fontSize = 30.sp,
                    color = Color.Black
                )
            }

        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                content = {
                    Icon(imageVector = Icons.Default.Add,contentDescription = "AddIcon")
                }
            )
        }


    )
}