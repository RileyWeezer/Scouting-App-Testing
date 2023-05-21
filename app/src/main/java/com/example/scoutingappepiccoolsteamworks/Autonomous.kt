package com.example.scoutingappepiccoolsteamworks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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
import org.w3c.dom.Text

class Autonomous : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.autonomous_layout)
//            val textView = findViewById<TextView>(R.id.teamNum)
//            val showTeam = findViewById<TextView>(R.id.teamNumber)
//            val text = textView.text.toString()
//            showTeam.setText(text.toString())


            val bMobility = findViewById<Button>(R.id.mobility)
            var mobil = false
            bMobility.setOnClickListener {
                if (mobil) {
                    bMobility.setText("Mobility: No")
                    mobil = false
                } else {
                    bMobility.setText("Mobility: Yes")
                    mobil = true
                }
            }

            val bLowAuto = findViewById<Button>(R.id.low_auto)
            var lowCount = 0
            bLowAuto.setOnClickListener {
                lowCount++
                bLowAuto.setText("Low Score: $lowCount")
            }

            val bHighAuto = findViewById<Button>(R.id.high_auto)
            var highCount = 0
            bHighAuto.setOnClickListener {
                highCount++
                bHighAuto.setText("High Score: $highCount")
            }

            val bRotorAuto = findViewById<Button>(R.id.rotor_auto)
            var rotor = false
            bRotorAuto.setOnClickListener {
                if (rotor) {
                    bRotorAuto.setText("Rotor Spin: No")
                    rotor = false
                } else {
                    bRotorAuto.setText("Rotor Spin: Yes")
                    rotor = true
                }
            }

            val bPenaltyAuto = findViewById<Button>(R.id.penalty_auto)
            var pen = 0
            bPenaltyAuto.setOnClickListener {
                pen++
                bPenaltyAuto.setText("Penalty: $pen")
            }

            val bToTele = findViewById<Button>(R.id.tele_switch)
            bToTele.setOnClickListener {
                val intent = Intent(this, Teleop::class.java)
                startActivity(intent)
            }

    }
}
