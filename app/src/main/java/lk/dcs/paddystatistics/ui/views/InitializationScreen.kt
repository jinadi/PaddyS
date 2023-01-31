package lk.dcs.paddystatistics.ui.views

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import lk.dcs.paddystatistics.ui.viewModel.IntInfoViewModel
import lk.dcs.paddystatistics.ui.viewModel.LoginViewModel

@Composable
fun InitializationScreen(context: Context, navController:NavController, intvm:IntInfoViewModel) {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bg_main4),
            contentDescription = "bg",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop

        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "System Initialization",
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
            )

            Text(
                text = "Officer Name: *****",
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Normal)
            )

            OutlinedTextField(
                value = "district",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "District") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
            )

            OutlinedTextField(
                value = "dsd",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "DS Division") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
            )

            OutlinedTextField(
                value = "gnd",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "GN Division") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
            )

            OutlinedTextField(
                value = "agriCenter",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Agrarian Services Center") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
            )


            OutlinedTextField(
                value = "village",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Village") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
            )

            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp))
                    .height(50.dp)
                    .width(385.dp),
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