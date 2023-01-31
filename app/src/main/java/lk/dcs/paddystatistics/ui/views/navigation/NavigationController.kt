package lk.dcs.paddystatistics.ui.views

import android.content.Context
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import lk.dcs.paddystatistics.database.IntInfoRepository
import lk.dcs.paddystatistics.database.MyDatabase
import lk.dcs.paddystatistics.database.UserRepository
import lk.dcs.paddystatistics.ui.viewModel.IntInfoViewModel
import lk.dcs.paddystatistics.ui.viewModel.LoginViewModel
import lk.dcs.paddystatistics.ui.views.navigation.ScreenRoutes

@Composable
fun NavControllerComp(context: Context) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenRoutes.LoginScreen.route) {

        composable(ScreenRoutes.LoginScreen.route) {
            val db = MyDatabase.getInstance(context)
            val repository = UserRepository(db)
            val vm = LoginViewModel(repository)
            LoginScreen(context = context, navController, vm)
        }

        composable(ScreenRoutes.InitializationScreen.route) {
            val db = MyDatabase.getInstance(context)
            val intRepo = IntInfoRepository(db)
            val Intvm = IntInfoViewModel(intRepo)
            InitializationScreen(context = context,navController,Intvm)
        }


       // composable(ScreenRoutes.InitializationScreen.route) { InitializationScreen(context = context,navController) }
        composable(ScreenRoutes.MenuScreen.route) { MenuScreen(context = context,navController) }
        composable(ScreenRoutes.P1Screen.route) { P1Screen(context = context,navController) }
        composable(ScreenRoutes.P0Screen.route) { P0Screen(context = context,navController) }
        composable(ScreenRoutes.HQRequestScreen.route) { HQRequestScreen(context = context,navController) }
        composable(ScreenRoutes.ReportScreen.route) { ReportScreen(context = context,navController) }

    }

}