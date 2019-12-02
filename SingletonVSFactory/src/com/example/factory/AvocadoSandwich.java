package com.example.factory;

public class AvocadoSandwich implements Meal {

	@Override
	public void isCorrectlyPrepared(boolean isCorrect) {
		if(isCorrect) {
			System.out.println("Sandwich met the customer's order.");
		}
		else {
			System.out.println("Aw snap! The sandwich has pickles on it.");
		}
	}

}
