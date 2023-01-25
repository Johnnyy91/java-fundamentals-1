package org.lessons.java.sondaggio;
import java.util.Scanner;

public class SondaggioGenerator {
	public static void main(String[] args) {
		
     Scanner input = new Scanner(System.in);
		
		System.out.print("Quanti studenti usano Android?");
		
		int Android = input.nextInt();
		
		System.out.print("Quanti studenti usano linux?");
		
		int Linux = input.nextInt();
		
		System.out.print("Quanti studenti usano Apple?");
		
		int Apple = input.nextInt();
		
		int Totale = Apple + Android + Linux;
		
		double AndroidQuantita = (Android / (double) Totale ) * 100;
		double linuxQuantita = (Linux / (double) Totale ) * 100;
		double AppleQuantita = (Apple / (double) Totale) * 100;
		
		System.out.println("Percentuale studenti Android:" + AndroidQuantita + "%");
		System.out.println("Percentuale studenti linux:" + linuxQuantita + "%");
		System.out.println("Percentuale studenti Apple:" + AppleQuantita + "%");
		
		input.close();	
	}
}
