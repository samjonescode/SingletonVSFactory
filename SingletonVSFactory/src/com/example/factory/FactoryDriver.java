package com.example.factory;

public class FactoryDriver {
	
	public static void main(String[] args) {
		
		//let's think of the meal factory as the kitchen staff of a restaurant.
		// the kitchen staff does not need to inform waiters how to prepare the meals.
		// the meal factory's sole duty should be to prepare the meal, and possibly alert the waiter when the meal is ready.
		
		// instantiate the mealFactory (kitchen)
//		MealFactory mealFactory = new MealFactory();
		
		//prepare the meal & alert the waiters that it's ready.
		Meal avoSandwich = MealFactory.prepareMeal("AvocadoSandwich");
		avoSandwich.isCorrectlyPrepared(true);
		
		//or, alert the waiter that the meal is not ready.
		Meal chicken = MealFactory.prepareMeal("ChickenAndAsparagus");
		chicken.isCorrectlyPrepared(false);
	}
	

}
