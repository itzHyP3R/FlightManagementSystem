package com.flight;

import java.time.LocalDate;

public class Flight {
	private String Flight_no;
	private String Flight_name;
	private String Departure_time;
	private String arrival_time;
	private String source;
	private LocalDate Flight_date;
	private String destination;
	private int no_of_seats;
	private int fare;
	private boolean status;
	private FlightType ftype;
	
	
	public Flight(String flight_no, String flight_name, String departure_time, String arrival_time, String source,
			LocalDate flight_date, String destination, int no_of_seats, int fare,FlightType ftype) {
		
		this.Flight_no = flight_no;
		this.Flight_name = flight_name;
		this.Departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.source = source;
		this.Flight_date = flight_date;
		this.destination = destination;
		this.no_of_seats = no_of_seats;
		this.fare = fare;
		this.status = true;
		this.ftype=ftype;
	}


	public String getFlight_no() {
		return Flight_no;
	}


	public void setFlight_no(String flight_no) {
		Flight_no = flight_no;
	}


	public String getFlight_name() {
		return Flight_name;
	}


	public void setFlight_name(String flight_name) {
		Flight_name = flight_name;
	}


	public String getDeparture_time() {
		return Departure_time;
	}


	public void setDeparture_time(String departure_time) {
		Departure_time = departure_time;
	}


	public String getArrival_time() {
		return arrival_time;
	}


	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public LocalDate getFlight_date() {
		return Flight_date;
	}


	public void setFlight_date(LocalDate flight_date) {
		Flight_date = flight_date;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public int getNo_of_seats() {
		return no_of_seats;
	}


	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}


	public int getFare() {
		return fare;
	}


	public void setFare(int fare) {
		this.fare = fare;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public FlightType getFtype() {
		return ftype;
	}


	public void setFtype(FlightType ftype) {
		this.ftype = ftype;
	}


	@Override
	public String toString() {
		return "Flight [Flight_no=" + Flight_no + ", Flight_name=" + Flight_name + ", Departure_time=HH:MM:SS ->" + Departure_time
				+ ", arrival_time=HH:MM:SS->" + arrival_time + ", source=" + source + ", Flight_date=" + Flight_date
				+ ", destination=" + destination + ", no_of_seats=" + no_of_seats + ", fare=" + fare + ", status="
				+ status + ", ftype=" + ftype + "]";
	}
	
	
	
	
	
	
	

}
