package com.aop.ticketbooking.modelDto;

public class Movies {
	private String movieName;
	
	private int seats_available;
	
	private int seats_booked;
	
	private int totalSeats;

	@Override
	public String toString() {
		return "Movies [movieName=" + movieName + ", seats_available=" + seats_available + ", seats_booked="
				+ seats_booked + ", totalSeats=" + totalSeats + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getSeats_available() {
		return seats_available;
	}

	public void setSeats_available(int seats_available) {
		this.seats_available = seats_available;
	}

	public int getSeats_booked() {
		return seats_booked;
	}

	public void setSeats_booked(int seats_booked) {
		this.seats_booked = seats_booked;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
}
