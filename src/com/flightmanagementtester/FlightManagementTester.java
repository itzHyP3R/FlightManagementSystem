package com.flightmanagementtester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.flight.Flight;
import com.fmsexception.FMSException;
import com.fmsutils.FMCUtils;
import com.fmsvalidation.FMSValidation;

public class FlightManagementTester {

	public static void main(String[] args) throws FMSException {
		try(Scanner sc=new Scanner(System.in))
		{
			List<Flight>flights= new ArrayList<>();
			boolean exit=false;
			
			while(!exit) {
				System.out.println("1.Add new flight :"
						+ "\n2.Display all flights :"
						+ "\n3.Search flights by city"
						+ "\n4.Sort flights as per date"
						+ "\n5.Change destination "
						+ "\n6.Remove flight");
				System.out.println("Enter choice :");
				int choice;
				choice=sc.nextInt();
				try {
					
				
				switch (choice) {
				case 1:
					
					System.out.println("Enter Flight_no \nFlight_name \nDeparture_time \narrival_time \nsource"
							+ "\nFlight_date"
							+ "\ndestination"
							+ "\nno_of_seats"
							+ "\nfare"
							+ "\nftype");
					
					Flight f1 = FMSValidation.ValidateInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next());
					flights.add(f1);
					
					break;
					
				case 2:
					for (Flight f : flights) {
						System.out.println(f);
						
					}
					break;
					
				case 3:
					System.out.println("Enter source city :");
					String scity=sc.next();
					FMCUtils.DisplayByCity(scity,flights);
					break;
				
				case 4:
					Collections.sort(flights,Comparator.comparing(Flight::getFlight_date));
					for (Flight f2 : flights) {
						System.out.println(f2);
						
					}
					break;
				
				case 5:
					String dc1="PUNE";
					System.out.println("Enter new destination city");
					String dc2=sc.next();
					FMCUtils.ChangeDestination(dc1, dc2, flights);
					System.out.println("Destination updated !!");
					break;
					
				case 6:
					System.out.println("Enter flight no :");
					String fno=sc.next();
					FMCUtils.RemoveFlight(fno, flights);
					System.out.println("Flight removed !!");
					break;
					
				case 7:
					exit=true;
					
				
				default:
					break;
				}
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				
			}
			
		}

	}

}
