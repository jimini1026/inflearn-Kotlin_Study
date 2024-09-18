package com.example.databinding_ex

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databinding_ex.databinding.ActivityDiceBinding
import kotlin.random.Random

class DiceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_dice)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener {
            Toast.makeText(this, "주사위 ㄱ", Toast.LENGTH_LONG).show()

            val number1 = Random.nextInt(1, 6)
            val number2 = Random.nextInt(1, 6)

            if (number1 == 1) {
                diceImage1.setImageResource(R.drawable.dice_1)
            } else if (number1 == 2) {
                diceImage1.setImageResource(R.drawable.dice_2)
            } else if (number1 == 3) {
                diceImage1.setImageResource(R.drawable.dice_3)
            } else if (number1 == 4) {
                diceImage1.setImageResource(R.drawable.dice_4)
            } else if (number1 == 5) {
                diceImage1.setImageResource(R.drawable.dice_5)
            } else if (number1 == 6) {
                diceImage1.setImageResource(R.drawable.dice_6)
            }


            if (number2 == 1) {
                diceImage2.setImageResource(R.drawable.dice_1)
            } else if (number2 == 2) {
                diceImage2.setImageResource(R.drawable.dice_2)
            } else if (number2 == 3) {
                diceImage2.setImageResource(R.drawable.dice_3)
            } else if (number2 == 4) {
                diceImage2.setImageResource(R.drawable.dice_4)
            } else if (number2 == 5) {
                diceImage2.setImageResource(R.drawable.dice_5)
            } else if (number2 == 6) {
                diceImage2.setImageResource(R.drawable.dice_6)
            }
        }
    }
}