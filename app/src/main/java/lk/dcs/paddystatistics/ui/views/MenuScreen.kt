package lk.dcs.paddystatistics.ui.views

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import lk.dcs.paddystatistics.R
import lk.dcs.paddystatistics.ui.views.navigation.ScreenRoutes

@Composable
fun MenuScreen(context: Context, navController: NavController) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(painter = painterResource(id = R.drawable.bg_main4),
            contentDescription = "bg1",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Row(

            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(10.dp)
                //.border(width = 1.dp, color = Color.Magenta),

            ) {

           // Spacer(modifier = Modifier.weight(1F))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,


                //modifier = Modifier.padding(10.dp).border(width = 1.dp, color = Color.Blue)
            ) {


               // Spacer(modifier = Modifier.height(52.dp))

                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    modifier = Modifier
                        .height(220.dp)
                        .width(200.dp)
                        .clip(RoundedCornerShape(12.dp, 12.dp, 12.dp, 12.dp)),

                    onClick = {
                        //P1 form btn click
                        Toast.makeText(context, "Success P1 form", Toast.LENGTH_LONG)
                            .show()
                        navController.navigate(ScreenRoutes.InitializationScreen.route)

                    }
                ) {
                    Column(
                        modifier = Modifier
                            .padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Text(
                            text = "P1",
                            color = Color.Black,
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Image(
                            painter = painterResource(id = R.drawable.p1_logo),
                            contentDescription = null,

                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                        )
                    }

                }

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    modifier = Modifier
                        .height(108.dp)
                        .width(200.dp)
                        .clip(RoundedCornerShape(12.dp, 12.dp, 12.dp, 12.dp)),
                    onClick = {
                        //reports btn click

                        navController.navigate(ScreenRoutes.ReportScreen.route)
                        Toast.makeText(
                            context,
                            "Reports...",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                ) {
                    Column(
                        modifier = Modifier
                            .padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Text(
                            text = "Reports",
                            color = Color.Black,
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Image(
                            painter = painterResource(id = R.drawable.reports_logo),
                            contentDescription = null,

                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                        )
                    }

                }


            } // end column 1

            Spacer(modifier = Modifier.width(20.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                //modifier = Modifier.padding(10.dp).border(width = 1.dp, color = Color.Blue)
            ) {


                //Spacer(modifier = Modifier.height(52.dp))

                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    modifier = Modifier
                        .height(100.dp)
                        .width(138.dp)
                        .clip(RoundedCornerShape(12.dp, 12.dp, 12.dp, 12.dp)),
                    onClick = {
                        // P0 form btn click

                        navController.navigate(ScreenRoutes.P0Screen.route)
                        Toast.makeText(
                            context,
                            "P0 form...",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                ) {
                    Column(
                        modifier = Modifier
                            .padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Text(
                            text = "P0",
                            color = Color.Black,
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Image(
                            painter = painterResource(id = R.drawable.p0_logo),
                            contentDescription = null,

                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                        )
                    }

                }

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    modifier = Modifier
                        .height(228.dp)
                        .width(138.dp)
                        .clip(RoundedCornerShape(12.dp, 12.dp, 12.dp, 12.dp)),
                    onClick = {
                        //reports btn click

                        navController.navigate(ScreenRoutes.ReportScreen.route)
                        Toast.makeText(
                            context,
                            "HQ Requests...",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                ) {
                    Column(
                        modifier = Modifier
                            .padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Text(
                            text = "HQ Request",
                            color = Color.Black,
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Image(
                            painter = painterResource(id = R.drawable.request_logo),
                            contentDescription = null,

                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                        )
                    }

                }

                Spacer(modifier = Modifier.height(52.dp))


            } //end column 2

        } //end row

       /* Box(
            contentAlignment = Alignment.BottomStart,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = lk.dcs.paddystatistics.R.drawable.footer),
                contentDescription = "headerImage",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .width(450.dp)
                    .height(80.dp)
            )
        }*/

    } //end box
}

