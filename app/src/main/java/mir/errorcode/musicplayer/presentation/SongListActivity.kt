package mir.errorcode.musicplayer.presentation

import android.media.MediaScannerConnection
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mir.errorcode.musicplayer.ui.theme.MusicPlayerTheme
import mir.errorcode.musicplayer.ui.theme.SongListScreen
import java.io.File

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SongListScreen {songs, position -> }



        }
    }

}



//                                     scan

//scanMusicFile("/storage/emulated/0/Music/Chaos Creation - Masochist’s Dreamland.mp3")
//    scanMusicFile("/storage/emulated/0/Music/Slayer - Angel Of Death.mp3")
//    private fun scanMusicFile(path: String) {
//        val file = File(path)
//        if (file.exists()) {
//            MediaScannerConnection.scanFile(
//                this,
//                arrayOf(file.absolutePath),
//                null
//            ) { _, uri ->
//                Log.d("MediaScanner", "File scanned: $uri")
//            }
//        } else {
//            Log.e("MediaScanner", "File not found: $path")
//        }
//    }