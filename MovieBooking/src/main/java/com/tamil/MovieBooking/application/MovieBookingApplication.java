package com.tamil.MovieBooking.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tamil.MovieBooking.modelObjects.Movie;

@SpringBootApplication
public class MovieBookingApplication{

	public static void main(String[] args) {
		
		ConfigurableApplicationContext con =  SpringApplication.run(MovieBookingApplication.class, args);
		Movie m = con.getBean(Movie.class);
		m.show();
	}
//
//	@Override  
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)   
//	{  
//	return application.sources(MovieBookingApplication.class);  
//	}   
}
