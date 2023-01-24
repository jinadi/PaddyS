package lk.dcs.paddystatistics.ui.views

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginScreen(context: Context, navController:NavController) {

    var username by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }


    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = lk.dcs.paddystatistics.R.drawable.header),
            contentDescription = "headerImage",
            modifier = Modifier.width(450.dp).height(218.dp),
            contentScale = ContentScale.FillWidth,
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(70.dp))
            Text(
                text = "P1 - Agriculture Census",
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
            )

            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                label = { Text(text = "Username") },
                modifier = Modifier.padding(16.dp)
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "Password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.padding(16.dp)
            )

            // var context = LocalContext.current

            Button(
                colors = ButtonDefaults.buttonColors(Color(0xff6750A4)),
                modifier = Modifier.height(63.dp).width(168.dp)
                    .clip(RoundedCornerShape(100.dp, 100.dp, 100.dp, 100.dp)),
                onClick = {
                    if (username.equals("abc") || password.equals("123")) {
                        // login process
                        /*


                        */
                        navController.navigate(ScreenRoutes.P1MenuScreen.route)
                    } else {
                        navController.navigate(ScreenRoutes.LoginScreen.route)
                        Toast.makeText(
                            context,
                            "Username/Password cannot be blank",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }//end column
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = lk.dcs.paddystatistics.R.drawable.footer),
                contentDescription = "headerImage",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.width(450.dp).height(80.dp)
            )
        }
    }
}

