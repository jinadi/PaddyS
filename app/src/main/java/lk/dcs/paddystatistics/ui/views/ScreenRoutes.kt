package lk.dcs.paddystatistics.ui.views

sealed class ScreenRoutes(val route: String) {
    object LoginScreen :ScreenRoutes("LoginScreen")
    object P1MenuScreen : ScreenRoutes("P1MenuScreen")
    object FarmerRegScreen : ScreenRoutes("FarmerRegScreen")
    object PaddyRegScreen : ScreenRoutes("PaddyRegScreen")
    object P1Screen : ScreenRoutes("P1Screen")
    object P0Screen : ScreenRoutes("P0Screen")
    object HQRequestScreen : ScreenRoutes("HQRequestScreen")
    object ReportScreen : ScreenRoutes("ReportRegScreen")

}