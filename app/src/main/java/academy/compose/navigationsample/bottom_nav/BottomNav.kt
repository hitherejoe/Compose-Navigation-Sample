package academy.compose.navigationsample.bottom_nav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import academy.compose.navigationsample.ui.NavigationSampleTheme

class BottomNav : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationSampleTheme {
                Main()
            }
        }
    }
}