package com.fmsvalidation;

import java.time.LocalDate;

import com.flight.Flight;
import com.flight.FlightType;
import com.fmsexception.FMSException;

public class FMSValidation {
	
	public static Flight ValidateInputs(String flight_no, String flight_name, String departure_time, String arrival_time, String source,
			String flight_date, String destination, int no_of_seats, int fare,String ftype) throws FMSException{
		
				
				String Nflight_no=ValidateFlightNumber(flight_no);
				String FFlightdate=ValidateFlightDate(flight_date);
				LocalDate FinalFlightDate=LocalDate.parse(FFlightdate);
				FlightType FinalNftype=ValidateFlightType(ftype);
				
				
				
				return new Flight(Nflight_no,flight_name,departure_time,arrival_time,source,FinalFlightDate,destination,no_of_seats,fare,FinalNftype);
				

				
			}
	
	public static String ValidateFlightNumber(String flight_no) throws FMSException {
		
		if(!flight_no.matches("^[A-Z0-9]{6}")) {
			throw new FMSException("Flight number should be 6 digits only example IND007");
		}
		return flight_no;
		
	}
	
	public static String ValidateFlightDate(String flight_date) throws FMSException {
		LocalDate Wflight_date=LocalDate.parse(flight_date);
		if(Wflight_date.isBefore(LocalDate.now())) {
			throw new FMSException("Flight Date should not be before today's date :");
		}
		return flight_date;
		
	}
	
	public static FlightType ValidateFlightType(String flight_type) throws FMSException {
	    try {
	        FlightType fff = FlightType.valueOf(flight_type.toUpperCase());
	        return fff;
	    } catch (IllegalArgumentException e) {
	        throw new FMSException("Flight type invalid !!");
	    }
	}
	
	
	
	
	
	

}
