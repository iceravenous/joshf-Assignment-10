package com.coderscampus.joshfAssignment10.spoonacular;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.joshfAssignment10.spoonacular.dto.SpoonacularResponse;


public class SpoonacularIntegration {
// Coming from lesson 08 = Rest calls
	
	@Test
	public void callApiExample () {
		RestTemplate rt = new RestTemplate();
		
		
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
							.queryParam("timeFrame", "day")
							.queryParam("targetCalories", 1000)
							.queryParam("diet", "Ketogenic")
							.queryParam("apiKey", "097269045a81483cba7bb4c95792d406")
							.build()
							.toUri();
		

		ResponseEntity<SpoonacularResponse> response = rt.getForEntity(uri, SpoonacularResponse.class);
		System.out.println(response.getBody());
		
//		String response = rt.getForObject(uri,  String.class);
//		System.out.println(response);
	}
}
