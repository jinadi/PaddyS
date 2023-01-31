package lk.dcs.paddystatistics.ui.views

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import lk.dcs.paddystatistics.R

@Composable
fun P1Screen(context: Context, navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.backg),
            contentDescription = "bg",
            modifier = Modifier.fillMaxSize().blur(50.dp),
            contentScale = ContentScale.Crop

        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "P1 Paddy Records",
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
            )

//        Text(
//            text = "************",
//            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Normal)
//        )

            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Year") },
                modifier = Modifier.padding(15.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Season") },
                modifier = Modifier.padding(15.dp)
            )

            Text(
                text = "Cultivated Land",
                style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Normal),
//            modifier = Modifier.fi
            )

            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Acre") },
                modifier = Modifier.padding(15.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Rood") },
                modifier = Modifier.padding(15.dp)
            )


            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Perches") },
                modifier = Modifier.padding(15.dp)
            )

            Text(
                text = "Harvested Land",
                style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Normal)
            )

            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Acre") },
                modifier = Modifier.padding(15.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Rood") },
                modifier = Modifier.padding(15.dp)
            )


            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Perches") },
                modifier = Modifier.padding(15.dp)
            )

            Button(
                colors = ButtonDefaults.buttonColors(Color(0xff6750A4)),
                modifier = Modifier.clip(RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp)),
                onClick = {

                }
            ) {
                Text(
                    text = "Next",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }
    }

    }