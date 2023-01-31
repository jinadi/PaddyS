package lk.dcs.paddystatistics.ui.views

import android.content.Context
import android.graphics.Color.parseColor
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import lk.dcs.paddystatistics.R
import lk.dcs.paddystatistics.ui.viewModel.LoginViewModel
import lk.dcs.paddystatistics.ui.views.navigation.ScreenRoutes

@Composable
fun LoginScreen(context: Context, navController:NavController, vm: LoginViewModel) {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.bg_main4),
        contentDescription = "bg",
            modifier = Modifier
                .fillMaxSize(),
                //.blur(20.dp),
            contentScale = ContentScale.Crop

            )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()

        ) {
            Image(painter = painterResource(id = R.drawable.logo_smp1), contentDescription = stringResource(
                id = androidx.compose.ui.R.string.selected),
                modifier = Modifier
                    .width(300.dp)
                    .height(250.dp)
            )
            Spacer(modifier = Modifier.height(90.dp))

            val hashcode = "#836504".hashCode()
            Text(
                text = "- - Department of Census & Statistics - -",
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colors.primary)
            )

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Sign-In",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Light, color = MaterialTheme.colors.primary)
            )
            //Spacer(modifier = Modifier.height(70.dp))

            OutlinedTextField(
                value = vm.username.value,
                onValueChange = { vm.username.value = it },
                label = { Text(text = "Username", color = MaterialTheme.colors.primary, fontWeight = FontWeight.Light)},
                modifier = Modifier.padding(15.dp)
            )

            OutlinedTextField(
                value = vm.password.value,
                onValueChange = { vm.password.value = it },
                label = { Text(text = "Password",color = MaterialTheme.colors.primary, fontWeight = FontWeight.Light) },
                modifier = Modifier.padding(15.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))
            vm.isAuth(vm.username.value, vm.password.value)

            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                modifier = Modifier.clip(RoundedCornerShape(50.dp, 50.dp, 50.dp, 50.dp)),
                onClick = {

                    /*var u= User(vm.username.value,vm.password.value)
                vm.insertUser(u)*/

                    if (vm.userById != null) {
                        Toast.makeText(
                            context,
                            "Success ${vm.userById?.username}",
                            Toast.LENGTH_LONG
                        )
                            .show()
                        navController.navigate(ScreenRoutes.MenuScreen.route)
                    } else {
                        navController.navigate(ScreenRoutes.LoginScreen.route)
                        Toast.makeText(
                            context,
                            "Login Failed",
                            Toast.LENGTH_LONG
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

        }
    }
}

val String.color
    get() = Color(parseColor(this))