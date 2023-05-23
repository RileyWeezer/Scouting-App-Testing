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

class Teleop : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.teleop_layout)

        val showTeam = findViewById<TextView>(R.id.teamNumberTele)
        val number = intent.getStringExtra("teamNumberInput")
        showTeam.setText(number);

        val bLowTele = findViewById<Button>(R.id.low_tele)
        var low = 0
        bLowTele.setOnClickListener {
            low++
            bLowTele.setText("Low Fuel: $low")
        }

        val bHighTele = findViewById<Button>(R.id.high_tele)
        var high = 0
        bHighTele.setOnClickListener {
            high++
            bHighTele.setText("High Fuel: $high")
        }

        val bRotorTele = findViewById<Button>(R.id.rotor_tele)
        var rotor = false
        bRotorTele.setOnClickListener {
            if (rotor) {
                rotor = false
                bRotorTele.setText("Rotor Spin: No")
            } else {
                rotor = true
                bRotorTele.setText("Rotor Spin: Yes")
            }
        }

        val bTakeoffTele = findViewById<Button>(R.id.takeoff_tele)
        var takeoff = false
        bTakeoffTele.setOnClickListener {
            if (takeoff) {
                bTakeoffTele.setText("Takeoff Ready: No")
                takeoff = false
            } else {
                bTakeoffTele.setText("Takeoff Ready: Yes")
                takeoff = true
            }
        }

        val bPenaltyTele = findViewById<Button>(R.id.penalty_tele)
        var pen = 0
        bPenaltyTele.setOnClickListener {
            pen++
            bPenaltyTele.setText("Penalty: $pen")
        }

        val bFinish = findViewById<Button>(R.id.finsih)
        bFinish.setOnClickListener {
            val intent = Intent(this, End::class.java).apply {
                putExtra("teamNumberInput", number)
            }
            startActivity(intent)
        }
    }
}

