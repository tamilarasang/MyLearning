package com.aop.ticketbooking.modelDto;

import java.util.List;

import com.aop.logger.LoggableAnnotation;

public class Theater {

	private String theaterName;
	
	private List<Movies> moviesAvailable;

	@LoggableAnnotation
	public String getTheaterName() {
		return theaterName;
	}

	@LoggableAnnotation
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
		System.out.println("setter is Ended");
	}

	public List<Movies> getMoviesAvailable() {
		return moviesAvailable;
	}

	public void setMoviesAvailable(List<Movies> moviesAvailable) {
		this.moviesAvailable = moviesAvailable;
	}
	
}
