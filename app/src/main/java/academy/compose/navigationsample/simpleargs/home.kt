package academy.compose.navigationsample.simpleargs

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.*

@Composable
fun HomeArgs(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = { navController.navigate("profile/123456") },
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(text = "Navigate to profile")
        }
    }
}