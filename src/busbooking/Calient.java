package busbooking;

import java.util.Scanner;

public class Calient {

	public static void main(String[] args) {
BusBooking bb=new BusBooking("suman",1,"ejjjjjjjj@gmail.com",999125254);
System.out.println(bb);
  

Scanner sc= new Scanner(System.in);
  
 System.out.println("enter a departureStation");
 String departureStation=sc.next();
 
 System.out.println("enter a arrivalStation");
 String arrivalStation=sc.next();

 String bookTicket =departureStation+arrivalStation;
 System.out.println(bookTicket);
  
 
    

}


	}

