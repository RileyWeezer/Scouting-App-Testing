package com.example.scoutingappepiccoolsteamworks

import android.content.Intent
import android.graphics.Color
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

class End : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.end_layout)

        val showTeam = findViewById<TextView>(R.id.teamNumberEnd)
        val number = intent.getStringExtra("teamNumberInput")
        showTeam.setText(number);
        val backColor = intent.getStringExtra("alliance")
        val textColor = intent.getStringExtra("text")
        showTeam.setBackgroundColor(Color.parseColor(backColor))
        showTeam.setTextColor(Color.parseColor(textColor))

        var bWin = findViewById<Button>(R.id.win)
        bWin.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var bTie = findViewById<Button>(R.id.tie)
        bTie.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var bLose = findViewById<Button>(R.id.lose)
        bLose.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

