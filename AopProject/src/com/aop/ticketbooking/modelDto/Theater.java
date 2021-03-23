package com.aop.ticketbooking.modelDto;

import java.util.List;

public class Theater {

	private String theaterName;
	
	private List<Movies> moviesAvailable;

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public List<Movies> getMoviesAvailable() {
		return moviesAvailable;
	}

	public void setMoviesAvailable(List<Movies> moviesAvailable) {
		this.moviesAvailable = moviesAvailable;
	}
	
}
