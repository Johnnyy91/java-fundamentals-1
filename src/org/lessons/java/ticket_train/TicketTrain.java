package org.lessons.java.ticket_train;
import java.util.Scanner;


public class TicketTrain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
        System.out.println("Quanti km vuoi percorrere?");
		
        int km = s.nextInt();
		
		System.out.println("Età passeggero?");
			
		int age = s.nextInt();
		
		int discountVenti = 20;
		int discountQuaranta = 40;
		
		double ticketPrice = 0.21;
		
		if(age < 18) {
			double fullPrice = (double) km * ticketPrice;
			
			double	discountPrice = (double) ( fullPrice * discountVenti  ) / 100;
			
			double finalPrice = (double) fullPrice - discountPrice;
			
			System.out.println(finalPrice + " euro");
			
		}
		else if ( age > 65){
			
			double fullPrice = (double) km * ticketPrice;
			
			double	discountPrice = (double) ( fullPrice * discountQuaranta  ) / 100;
			
			double finalPrice = (double) fullPrice - discountPrice;
			
			System.out.println(finalPrice + " euro");
		}
		
		else {
			double fullPrice = (double) km * ticketPrice;
			
			System.out.println(fullPrice + " euro");
		}
			
		
		s.close();
	}

}








	
	
	
	
	
	