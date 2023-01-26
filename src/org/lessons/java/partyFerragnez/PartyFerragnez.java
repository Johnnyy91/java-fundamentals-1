package org.lessons.java.partyFerragnez;
import java.util.Scanner;


public class PartyFerragnez {
	public static void main(String[] args) {
		String[] CheckGuest = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", 
				                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili"};
				
		Scanner input = new Scanner(System.in);
				
		System.out.println("Inserisci il tuo Nome e Cognome");
			
		String tuoNome = input.nextLine();
				
		boolean inLista = false;
				
		for(int i=0; i < CheckGuest.length ; i++) {
					
		if(tuoNome.toLowerCase().trim().equals(CheckGuest[i].toLowerCase().trim())) {
						
			inLista=true;
						
			}
		}
		
		if(inLista) 
		System.out.println("Ciao " + tuoNome + " e' in lista");
				
		else System.out.println("Mi dispiace " + tuoNome + " lei non e' in lista" );
				
		input.close();
	}
	

}


