package lk.dcs.paddystatistics

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import lk.dcs.paddystatistics.ui.theme.PaddyStatisticsTheme
import lk.dcs.paddystatistics.ui.views.NavControllerComp

class MainActivity : ComponentActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaddyStatisticsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                  val context=applicationContext
                    NavControllerComp(context)

                }
         /*       val scaffoldState = rememberScaffoldState()
                val scope = rememberCoroutineScope()
                Scaffold(
                    scaffoldState = scaffoldState,
                    topBar = {
                             lk.dcs.paddystatistics.ui.views.navigation.AppBar(onNavigationIconClick = {
                                 scope.launch {
                                     scaffoldState.drawerState.open()
                                 }

                                }
                             )
                    },
                    drawerContent = {
                    DrawerHeader()
                    DrawerBody(items = listOf(
                        NavMenuItem(
                            id1 = "home",
                            title = "Home",
                            icon = Icons.Default.Home
                        ),
                        NavMenuItem(
                            id1 = "settings",
                            title = "Setting",
                            icon = Icons.Default.Settings
                        ),
                        NavMenuItem(
                            id1 = "help",
                            title = "Help",
                            icon = Icons.Default.Info
                        )

                    ), onItemClick ={
                        when(it.id1){
                            "home" -> {
                                val intent = Intent(this@MainActivity, ScreenRoutes.LoginScreen::class.java);
                                startActivity(intent);
                            }
                        }
                        println("Clicked on ${it.title}")
                    } )
                }) {

                }*/
            }
        }
    }
}

@Composable

fun screenBg(){
}


/*
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PaddyStatisticsTheme {
        Greeting("Android")
    }
}*/
