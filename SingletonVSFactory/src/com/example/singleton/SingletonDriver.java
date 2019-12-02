package com.example.singleton;

public class SingletonDriver {
	
	public static void main(String[] args) {
		Restaurant sammySlammers = Restaurant.getInstance();
//		sammySlammers.getClass();
		
		sammySlammers.restaurantSlogan();
		sammySlammers.servedMeal();
		sammySlammers.servedCustomer();
	}

}
