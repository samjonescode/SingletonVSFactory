package com.example.singleton;

public class Restaurant {
	
	private static Restaurant restaurant; // part 1, a private static field - must be static because the getInstance method is static.
	
	private int customersServed;
	private int mealsServed;
	private String cuisineType;
	
	// part 2, a private constructor
	private Restaurant () { 
		this.customersServed = 0;
		this.mealsServed = 0;
		this.cuisineType = "Mexican";
	}
	
	//part 3, a public static method to create or return the single restaurant
	// must be static, because you may not have an existing instance of Restaurant on which to call this method.
	public static Restaurant getInstance(){ 
		
		if(restaurant==null) { // if no restaurant exists, create one
			restaurant = new Restaurant();
		}
		//return a restaurant
		return restaurant;
	}
	
	public void servedMeal() {
		System.out.println("Meals served: " + ++this.mealsServed);
	}
	
	public void servedCustomer() {
		System.out.println("People served: " + ++this.customersServed);

	}
	
	public void restaurantSlogan() {
		System.out.println("What do you mean, 'do we have escargot?' We're a Mexican restaurant!!!");
	}

	@Override
	public String toString() {
		return "Restaurant [customersServed=" + customersServed + ", mealsServed=" + mealsServed + ", cuisineType="
				+ cuisineType + "]";
	}
	
	
}
