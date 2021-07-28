package com.fsociety.rollerdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find the button in the layout
        val buttonRoll:Button = findViewById(R.id.buttonRoll)

        buttonRoll.setOnClickListener { rollDice() }

        rollDice()

    }

    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRole = dice.roll()

        //find the ImageView in the layout
        val diceImage : ImageView = findViewById(R.id.imageView)

        //show the image based on the roll number
        val ressourceImage = when(diceRole){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }

        //update the imageView
        diceImage.setImageResource(ressourceImage)

    }
}
