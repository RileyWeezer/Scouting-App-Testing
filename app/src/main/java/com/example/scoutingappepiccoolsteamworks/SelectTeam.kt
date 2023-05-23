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
        val intent = Intent(this@SelectTeam, Autonomous::class.java)
        val editText = findViewById<EditText>(R.id.teamNum)

        val bRed1 = findViewById<Button>(R.id.red1)
        bRed1.setOnClickListener {
            intent.apply {
                putExtra("teamNumberInput", editText.text.toString())
                putExtra("alliance", "#ff0000")
                putExtra("text", "#000000")
            }
            startActivity(intent)
        }
        val bRed2 = findViewById<Button>(R.id.red2)
        bRed2.setOnClickListener {
            intent.apply {
                putExtra("teamNumberInput", editText.text.toString())
                putExtra("alliance", "#ff0000")
                putExtra("text", "#000000")
            }
            startActivity(intent)
        }
        val bRed3 = findViewById<Button>(R.id.red3)
        bRed3.setOnClickListener {
            intent.apply {
                putExtra("teamNumberInput", editText.text.toString())
                putExtra("alliance", "#ff0000")
                putExtra("text", "#000000")
            }
            startActivity(intent)
        }
        val bBlue1 = findViewById<Button>(R.id.blue1)
        bBlue1.setOnClickListener {
            intent.apply {
                putExtra("teamNumberInput", editText.text.toString())
                putExtra("alliance", "#170cf0")
                putExtra("text", "#ffffff")
            }
            startActivity(intent)
        }
        val bBlue2 = findViewById<Button>(R.id.blue2)
        bBlue2.setOnClickListener {
            intent.apply {
                putExtra("teamNumberInput", editText.text.toString())
                putExtra("alliance", "#170cf0")
                putExtra("text", "#ffffff")
            }
            startActivity(intent)
        }
        val bBlue3 = findViewById<Button>(R.id.blue3)
        bBlue3.setOnClickListener {
            intent.apply {
                putExtra("teamNumberInput", editText.text.toString())
                putExtra("alliance", "#170cf0")
                putExtra("text", "#ffffff")
            }
            startActivity(intent)
        }




        }
    }
