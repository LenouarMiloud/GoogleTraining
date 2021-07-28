package com.fsociety.rollerdice

class Dice(private val numSide:Int) {
	// roll function
    fun roll():Int{
        return (1..numSide).random()
    }
}