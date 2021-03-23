package com.aop.ticketbooking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.ticketbooking.services.TicketBookingService;

public class TicketBookingMainClass {

	public static void main(String[] args) {
		ApplicationContext applicationContextXml = new ClassPathXmlApplicationContext("spring.xml");
		
		TicketBookingService ticketBookingService = applicationContextXml.getBean("ticketBookingService",TicketBookingService.class);
		System.out.println(ticketBookingService.getTheater().getTheaterName());
		ticketBookingService.getTheater().setTheaterName("dummy name");
		System.out.println(ticketBookingService.getTheater().getTheaterName());
	}

}
