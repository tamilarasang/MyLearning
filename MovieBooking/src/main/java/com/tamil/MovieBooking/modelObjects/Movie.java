package com.tamil.MovieBooking.modelObjects;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	private String movieName;
	
	private int runTime;
	
	private String language;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void show() {
		System.out.println("Movie name displayed");
	}
}
