package lk.dcs.paddystatistics.ui.views.navigation

sealed class ScreenRoutes(val route: String) {
    object LoginScreen : ScreenRoutes("LoginScreen")
    object InitializationScreen : ScreenRoutes("initializationScreen")
    object MenuScreen : ScreenRoutes("MenuScreen")
    object P1Screen : ScreenRoutes("P1Screen")
    object P0Screen : ScreenRoutes("P0Screen")
    object HQRequestScreen : ScreenRoutes("HQRequestScreen")
    object ReportScreen : ScreenRoutes("ReportRegScreen")

}