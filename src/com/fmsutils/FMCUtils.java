package com.fmsutils;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import com.flight.Flight;
import com.fmsexception.FMSException;

public class FMCUtils {
	private static String fn;
	private static LocalDate fd;
	private static String dt;
	private static String at;
	public static void DisplayByCity(String scity,List<Flight>flights	) throws FMSException {
		boolean flag3=false;
		for (Flight f : flights) {
			if(f.getSource().equals(scity)) {
				fn=f.getFlight_name();
				fd=f.getFlight_date();
				dt=f.getDeparture_time();
				at=f.getArrival_time();
				System.out.println("Flight name  "+fn);
				System.out.println("Flight date  "+fd);
				System.out.println("Flight dept time  "+dt);
				System.out.println("Flight arrical time  "+at);
				System.out.println("");
				flag3=true;
				
			}
			
		}
		if(!flag3) {
			throw new FMSException("Source city not found !!");
			
		}
		
		
	}
	public static void ChangeDestination(String scity,String nscity,List<Flight>flights) throws FMSException {
		boolean flag=false;
		for (Flight f1 : flights) {
			if(f1.getDestination().equals(scity)) {
				f1.setDestination(nscity);
				flag=true;
				
			}
			
		}
		if(!flag) {
			throw new FMSException("Destination city not found !!");
			
		}
	}
	
	
	public static void RemoveFlight(String fno,List<Flight>flights) throws FMSException {
	Iterator<Flight>iterator=flights.iterator();
	boolean flag=false;
	while(iterator.hasNext()) {
		Flight f1= iterator.next();
		if(f1.getFlight_no().equals(fno)) {
			iterator.remove();
			flag=true;
		}
	}
	if(!flag) {
		throw new FMSException("Flight not found !!");
		
	}
		
	}
}
