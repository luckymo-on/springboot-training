package com.example.food_service.exceptions;


public class FoodAlreadyFoundException extends RuntimeException {

	public FoodAlreadyFoundException(String message) {
		super(message);
	}

}