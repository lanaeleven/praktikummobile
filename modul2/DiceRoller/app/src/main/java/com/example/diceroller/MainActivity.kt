package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage1 = findViewById(R.id.imageView1)
        diceImage2 = findViewById(R.id.imageView2)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val randomInt1 = (1..6).random()
        val randomInt2 = (1..6).random()

        val drawableResource1 = when(randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when(randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage1.setImageResource(drawableResource1)
        diceImage2.setImageResource(drawableResource2)

        var toastText = "Anda belum beruntung!"
        if(randomInt1 == randomInt2){
             toastText = "Selamat Anda mendapat dadu double!"
        }
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show()
    }
}