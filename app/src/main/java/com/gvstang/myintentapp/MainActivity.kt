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

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        val btnMoveActivity2: Button = findViewById(R.id.btn_move_activity2)
        val btnMoveActivityData: Button = findViewById(R.id.btn_move_activity_data)
        val btnMoveActivityObject: Button = findViewById(R.id.btn_move_activity_object)
        btnMoveActivity.setOnClickListener(this)
        btnMoveActivity2.setOnClickListener(this)
        btnMoveActivityData.setOnClickListener(this)
        btnMoveActivityObject.setOnClickListener(this)
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
            R.id.btn_move_activity_data -> {
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Akmal")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 21)
                startActivity(moveWithDataIntent)
            }
            R.id.btn_move_activity_object -> {
                val person = Person(
                    "Farih Akmal Haqiqi",
                    5,
                    "fakmalh@icloud.com",
                    "Kota Bandung"
                )

                val moveObjectIntent = Intent(this@MainActivity, MoveWithObjectActivity::class.java)
                moveObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
                startActivity(moveObjectIntent)
            }
        }
    }
}