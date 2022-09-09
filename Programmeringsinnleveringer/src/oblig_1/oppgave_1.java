package oblig_1;

import java.util.Scanner;

public class oppgave_1 {
	
	public static void main(String[] args) {

		try(Scanner lesInn = new Scanner (System.in)){
			System.out.println("Skriv inn din lønn");			
			
			double brutto = Double.parseDouble(lesInn.nextLine());
			
			double ts1 = (brutto - 164101)*0.0093;
			double ts2 = (brutto - 230951)*0.0241;
			double ts3 = (brutto - 580651)*0.1152;
			double ts4 = (brutto - 934051)*0.1452;
			
			double max1 = (230951 - 164101)*0.0093;
			double max2 = (580651 - 230951)*0.0241;
			double max3 = (934051 - 580651)*0.1152;
			
			if (brutto <= 164100) {
				System.out.println("Ingen skatt");
			} else if (brutto > 164100 && brutto <= 230950) {
				System.out.println("Skattenivå 1, du betaler " + ts1 + ",- NOK i skatt" );
			} else if (brutto > 230950 && brutto <= 580650) {
				System.out.println("Skattenivå 1 og 2, du betaler " + (ts2 + max1)+ ",- NOK");
			} else if (brutto > 580650 && brutto <= 934050) {
				System.out.println("Skattenivå 1, 2 og 3, du betaler " + (ts3 + max1 + max2)+ ",- NOK");
			} else {
				System.out.println("Skattenivå 1, 2, 3 og 4, du betaler " + (ts4 + max1 + max2 + max3)+ ",-NOK");
			}
			
		}
	}
}
