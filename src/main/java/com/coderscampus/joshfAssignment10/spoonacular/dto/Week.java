package com.coderscampus.joshfAssignment10.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Week {
	
	@JsonProperty("monday")
	private DailyMeals daily1; 
	
	@JsonProperty("tuesday")
	private DailyMeals daily2;
	
	@JsonProperty("wednesday")
	private DailyMeals daily3;
	
	@JsonProperty("thursday")
	private DailyMeals daily4;
	
	@JsonProperty("friday")
	private DailyMeals daily5;
	
	@JsonProperty("saturday")
	private DailyMeals daily6;
	
	@JsonProperty("sunday")
	private DailyMeals daily7;
	
	
}
