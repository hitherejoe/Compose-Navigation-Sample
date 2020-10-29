package academy.compose.navigationsample.bottom_nav

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun One() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "One",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}