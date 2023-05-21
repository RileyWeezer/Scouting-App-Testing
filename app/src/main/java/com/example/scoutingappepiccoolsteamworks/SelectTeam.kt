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
            var hasNum = false;
            val bRed1 = findViewById<Button>(R.id.red1)
            bRed1.setOnClickListener {
                if(hasNum) {
                    val intent = Intent(this, Autonomous::class.java)
                    startActivity(intent)
                } else {

                }
            }
            val bRed2 = findViewById<Button>(R.id.red2)
            bRed2.setOnClickListener {
                if(hasNum) {
                    val intent = Intent(this, Autonomous::class.java)
                    startActivity(intent)
                } else {

                }
            }
            val bRed3 = findViewById<Button>(R.id.red3)
            bRed3.setOnClickListener {
                if(hasNum) {
                    val intent = Intent(this, Autonomous::class.java)
                    startActivity(intent)
                } else {

                }
            }
            val bBlue1 = findViewById<Button>(R.id.blue1)
            bBlue1.setOnClickListener {
                if(hasNum) {
                    val intent = Intent(this, Autonomous::class.java)
                    startActivity(intent)
                } else {

                }
            }
            val bBlue2 = findViewById<Button>(R.id.blue2)
            bBlue2.setOnClickListener {
                if(hasNum) {
                    val intent = Intent(this, Autonomous::class.java)
                    startActivity(intent)
                } else {

                }
            }
            val bBlue3 = findViewById<Button>(R.id.blue3)
            bBlue3.setOnClickListener {
                if(hasNum) {
                    val intent = Intent(this, Autonomous::class.java)
                    startActivity(intent)
                } else {

                }
            }
            val editText = findViewById<EditText>(R.id.teamNum)
            val bNumEnter = findViewById<Button>(R.id.enter)
            bNumEnter.setOnClickListener {
                val text = editText.text.toString()
                val intent = Intent(this, Autonomous::class.java)
                intent.putExtra("teamNumInput", text)
                hasNum = true;
            }

        }
    }
