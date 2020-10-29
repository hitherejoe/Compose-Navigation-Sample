package academy.compose.navigationsample.simpleargs

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ProfileArgs(profileId: String?) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Profile $profileId",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}