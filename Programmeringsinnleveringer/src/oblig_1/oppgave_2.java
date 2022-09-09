package oblig_1;

import java.util.Scanner;

public class oppgave_2 {

	public static void main(String[] args) {
		try(Scanner lesInn = new Scanner(System.in)){ 
			
			int grense = 10;
			for (int i = 1; i<=grense; i++) {
				
				System.out.println("Skriv inn poengsum");			
				int poengsum = Integer.parseInt(lesInn.nextLine());
				
				if (poengsum > 0) {
					if (poengsum <= 39) {
						System.out.println("F");
					} else if (poengsum <= 49) {
						System.out.println("E");
					} else if (poengsum <= 59) {
						System.out.println("D");
					} else if (poengsum <= 79) {
						System.out.println("C");
					} else if (poengsum <= 89) {
						System.out.println("B");
					} else if (poengsum <= 100) {
						System.out.println("A");
					} else {
						System.out.println("Ugyldig poengsum");
						i -= 1;
						//Tilbakestiller tellingen med 1 telling og poengsum kan settes inn på nytt
					}
				} else {
					System.out.println("Ugyldig poengsum");
					i -= 1;
				}
			}
		}
	}
}
