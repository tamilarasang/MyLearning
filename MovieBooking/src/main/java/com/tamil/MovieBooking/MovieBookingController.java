package com.tamil.MovieBooking;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieBookingController {
	@RequestMapping("/getMoviesList") 
	public List<String> getMoviesList(){
		List<String> movies = new ArrayList<>();
		movies.add("M1");
		movies.add("M2");
		movies.add("M3");
		return movies;
	}

}
