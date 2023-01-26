package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Richiedere nome, cognome, colore preferito e data di nascita
        
        System.out.println("Inserisci il tuo nome: ");
        String nome = input.nextLine();
        
        
        System.out.println("Inserisci il tuo cognome: ");
        String cognome = input.nextLine();
        
        System.out.println("Inserisci il tuo colore preferito: ");
        String colore = input.nextLine();
        
        System.out.println("Inserisci il tuo giorno di nascita: ");
        int giorno = input.nextInt();
       
        
        System.out.println("Inserisci il tuo mese di nascita: ");
        int mese = input.nextInt();
        
        
        System.out.println("Inserisci il tuo anno di nascita: ");
        int anno = input.nextInt();
        
        // Calcolare la somma del giorno, mese e anno di nascita
        
        int somma = giorno + mese + anno;
        
        // Concatenare i valori e creare la password
        
        String password = nome + "-" + cognome + "-" + colore + "-" + somma;
        
        // Stampa la password
        
        System.out.println("La tua password è: " + password);
        input.close();
    }
}

