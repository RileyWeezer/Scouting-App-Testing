package com.example.scoutingappepiccoolsteamworks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.scoutingappepiccoolsteamworks.ui.theme.ScoutingAppEpicCoolSteamworksTheme

class SelectTeam : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.team_select)

            val bRed1 = findViewById<Button>(R.id.red1)
            bRed1.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            val bRed2 = findViewById<Button>(R.id.red2)
            bRed2.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            val bRed3 = findViewById<Button>(R.id.red3)
            bRed3.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            val bBlue1 = findViewById<Button>(R.id.blue1)
            bBlue1.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            val bBlue2 = findViewById<Button>(R.id.blue2)
            bBlue2.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            val bBlue3 = findViewById<Button>(R.id.blue3)
            bBlue3.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            val editText = findViewById<EditText>(R.id.teamNum)
            val button = findViewById<Button>(R.id.enter)
            button.setOnClickListener {
                val text = editText.text.toString()
                // Do something with the text
            }

        }
    }


@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    ScoutingAppEpicCoolSteamworksTheme {
        Greeting2("Android")
    }
}