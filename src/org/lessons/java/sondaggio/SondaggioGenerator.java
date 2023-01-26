package org.lessons.java.sondaggio;
import java.util.Scanner;

public class SondaggioGenerator {
	public static void main(String[] args) {
		
     Scanner input = new Scanner(System.in);
		
		System.out.print("Quanti studenti usano Android?");
		
		int android = input.nextInt();
		
		System.out.print("Quanti studenti usano linux?");
		
		int linux = input.nextInt();
		
		System.out.print("Quanti studenti usano Apple?");
		
		int apple = input.nextInt();
		
		int totale = apple + android + linux;
		
		double androidQuantita = (android / (double) totale ) * 100;
		double linuxQuantita = (linux / (double) totale ) * 100;
		double appleQuantita = (apple / (double) totale) * 100;
		
		System.out.println("Percentuale studenti Android:" + androidQuantita + "%");
		System.out.println("Percentuale studenti linux:" + linuxQuantita + "%");
		System.out.println("Percentuale studenti Apple:" + appleQuantita + "%");
		
		input.close();	
	}
}
