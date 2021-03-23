package com.aop.ticketbooking.services;

import com.aop.ticketbooking.modelDto.Movies;
import com.aop.ticketbooking.modelDto.Theater;

public class TicketBookingService {

	private Movies movies;
	
	private Theater theater;


	public Movies getMovies() {
		return movies;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	
	
}
