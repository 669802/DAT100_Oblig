package oblig_1;

import java.util.Scanner;

public class oppgave_3 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
        
		System.out.print("Fakultet verdi: ");
        int n = Integer.parseInt(input.nextLine());

        int sum = 1;

        for (int i = n; i > 0; i--) {
            sum *= i;
        }

        System.out.println(sum);
    }
	}

}
