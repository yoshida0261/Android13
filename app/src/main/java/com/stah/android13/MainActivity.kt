package com.stah.android13

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.ActivityCompat
import com.stah.android13.ui.theme.Android13Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android13Theme {
                // A surface container using the 'background' color from the theme
                Surface(

                    color = MaterialTheme.colors.primary
                ) {
                    Greeting("Android")

                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    val activity = LocalContext.current as Activity
    TextButton(onClick = { requestPicker(activity = activity) }) {
        "Hello $name!"
    }
}

fun requestPicker(activity: Activity) {
    val PHOTO_PICKER_REQUEST_CODE = 1
    val intent = Intent(MediaStore.ACTION_PICK_IMAGES)
    ActivityCompat.startActivityForResult(activity, intent, PHOTO_PICKER_REQUEST_CODE, null)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Android13Theme {
        Greeting("Android")
    }
}
