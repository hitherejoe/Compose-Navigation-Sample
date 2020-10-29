package academy.compose.navigationsample.simpleargs

import academy.compose.navigationsample.simple.Home
import academy.compose.navigationsample.simple.Profile
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import academy.compose.navigationsample.ui.NavigationSampleTheme
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController

class SimpleArgsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationSampleTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = "home") {
                    composable("home") { HomeArgs(navController) }
                    composable(
                        "profile/{profileId}",
                        arguments = listOf(navArgument("profileId") { type = NavType.StringType })
                    ) { backStackEntry ->
                        ProfileArgs(backStackEntry.arguments?.getString("profileId")) }
                }
            }
        }
    }
}