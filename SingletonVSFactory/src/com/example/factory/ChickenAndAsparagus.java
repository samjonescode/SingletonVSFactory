package com.example.factory;

public class ChickenAndAsparagus implements Meal {

	@Override
	public void isCorrectlyPrepared(boolean isCorrect) {
		if(isCorrect) {
			System.out.println("Chicken met the customer's order.");
		}
		else {
			System.out.println("Aw snap! The chicken is blackened and not fried.");
		}
	}
}
