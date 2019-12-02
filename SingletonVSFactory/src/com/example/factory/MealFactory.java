package com.example.factory;

// a kitchen
// a design pattern that frees other classes from knowing about the details of making meals
// & simply prepares the meals.
public class MealFactory {

	public static Meal prepareMeal(String mealName) {
		if(mealName.equalsIgnoreCase("AvocadoSandwich")) {
			System.out.println("Order up! Avocado sandwich is ready.");
			return new AvocadoSandwich();
		} else if (mealName.equalsIgnoreCase("ChickenAndAsparagus")) {
			System.out.println("Order up! Chicken is ready.");
			return new ChickenAndAsparagus();
		} //burrito
		//tea and biscuits
		//more meals
		
		return null;
	}
}
