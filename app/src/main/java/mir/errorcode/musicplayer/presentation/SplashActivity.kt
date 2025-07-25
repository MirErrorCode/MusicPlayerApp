package mir.errorcode.musicplayer.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import mir.errorcode.musicplayer.R
import mir.errorcode.musicplayer.ui.theme.SplashScreen

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreen (
                onStartClick = { startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
                }
            )
        }
    }
}