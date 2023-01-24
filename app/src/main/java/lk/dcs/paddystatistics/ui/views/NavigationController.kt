package lk.dcs.paddystatistics.ui.views

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavControllerComp(context: Context) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenRoutes.LoginScreen.route) {
        composable(ScreenRoutes.LoginScreen.route) { LoginScreen(context = context, navController) }
        composable(ScreenRoutes.P1MenuScreen.route) { P1MenuScreen(context = context,navController) }
        composable(ScreenRoutes.FarmerRegScreen.route) { FarmerRegScreen(context = context,navController) }
        composable(ScreenRoutes.PaddyRegScreen.route) { PaddyRegScreen(context = context,navController) }
        composable(ScreenRoutes.P1Screen.route) { P1Screen(context = context,navController) }
        composable(ScreenRoutes.P0Screen.route) { P0Screen(context = context,navController) }
        composable(ScreenRoutes.HQRequestScreen.route) { HQRequestScreen(context = context,navController) }
        composable(ScreenRoutes.ReportScreen.route) { ReportScreen(context = context,navController) }

    }

}