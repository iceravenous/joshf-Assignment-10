package com.coderscampus.joshfAssignment10.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpoonacularResponse {
	
	@JsonProperty ("meals")
	private Meals[] meals; 
	
	@JsonProperty ("nutrients")
	private Nutrients nutrients;
	
	
	public Meals[] getMeals() {
		return meals;
	}
	public void setMeals(Meals[] meals) {
		this.meals = meals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	
	
	
}
