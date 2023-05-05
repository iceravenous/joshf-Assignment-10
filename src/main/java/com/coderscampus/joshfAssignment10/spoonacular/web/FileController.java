package com.coderscampus.joshfAssignment10.spoonacular.web;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.joshfAssignment10.spoonacular.dto.Meals;
import com.coderscampus.joshfAssignment10.spoonacular.dto.SpoonacularResponse;


@RestController
public class FileController {

//	@GetMapping("mealplanner/week")
//		public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions);
	String timeFrame = "day";
//	String numCalories = "1000";
//	String diet = "Vegetarian";
//	String exclusions = "Seafood";
	@GetMapping("/mealplanner/day")
		public void getDayMeals(@RequestParam String numCalories, 
								@RequestParam(required = false) String diet, 
								@RequestParam(required = false) String exclusions){
			RestTemplate rt = new RestTemplate();
			
			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
					.queryParam("timeFrame", "day")
					.queryParam("targetCalories", 1000)
					.queryParam("diet", diet)
					.queryParam("exclude", exclusions)
					.queryParam("apiKey", "097269045a81483cba7bb4c95792d406")
					.build()
					.toUri();
			
			ResponseEntity<SpoonacularResponse> response = rt.getForEntity(uri, SpoonacularResponse.class);
			System.out.println(response.getBody());
		
	}

	@GetMapping("/mealplanner/week")
	public void getWeekMeals(@RequestParam String timeFrame,
							@RequestParam String numCalories, 
							@RequestParam(required = false) String diet, 
							@RequestParam(required = false) String exclusions){
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("timeFrame", timeFrame)
				.queryParam("targetCalories", numCalories)
				.queryParam("diet", diet)
				.queryParam("exclude", exclusions)
				.queryParam("apiKey", "097269045a81483cba7bb4c95792d406")
				.build()
				.toUri();

		ResponseEntity<SpoonacularResponse> response = rt.getForEntity(uri, SpoonacularResponse.class);
		System.out.println(response.getBody());
	
}
	
}
