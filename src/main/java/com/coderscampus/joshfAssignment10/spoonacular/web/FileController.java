package com.coderscampus.joshfAssignment10.spoonacular.web;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.joshfAssignment10.spoonacular.dto.WeekResponse;
import com.coderscampus.joshfAssignment10.spoonacular.dto.DayResponse;


@RestController
public class FileController {

//	@GetMapping("mealplanner/week")
//		public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions);
	@Value("${spoonacular.urls.base}")
	private String base;
	@Value("${spoonacular.urls.mealplan}")
	private String plan;
	
	String timeFrame = "day";
	String numCalories = "";
	String diet = "";
	String exclusions = "";
	@GetMapping("/mealplanner/day")
		public ResponseEntity<DayResponse> getDayMeals(@RequestParam(required = false) String numCalories,
//	public void getDayMeals(@RequestParam String numCalories,
								@RequestParam(required = false) String diet, 
								@RequestParam(required = false) String exclusions){
			RestTemplate rt = new RestTemplate();
			
//			URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
			URI uri = UriComponentsBuilder.fromHttpUrl(base+plan)
					.queryParam("timeFrame", "day")
					.queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
					.queryParamIfPresent("diet", Optional.ofNullable(diet))
					.queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
					.queryParam("apiKey", "097269045a81483cba7bb4c95792d406")
					.build()
					.toUri();
			
			ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);

			return response;
		
	}

	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam(required = false) String numCalories,
							@RequestParam(required = false) String diet, 
							@RequestParam(required = false) String exclusions){
		RestTemplate rt = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl(base+plan)
				.queryParam("timeFrame", "week")
				.queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
				.queryParamIfPresent("diet", Optional.ofNullable(diet))
				.queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
				.queryParam("apiKey", "097269045a81483cba7bb4c95792d406")
				.build()
				.toUri();
		
		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);

		return response;
}
	
}
