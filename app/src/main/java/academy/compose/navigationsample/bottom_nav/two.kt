package academy.compose.navigationsample.bottom_nav

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Two() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            "Two",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}