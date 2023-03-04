package com.gvstang.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById<Button>(R.id.btn_move_activity)
        val btnMoveActivity2: Button = findViewById<Button>(R.id.btn_move_activity2)
        btnMoveActivity.setOnClickListener(this)
        btnMoveActivity2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity2 -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity2::class.java)
                startActivity(moveIntent)
            }
        }
    }
}