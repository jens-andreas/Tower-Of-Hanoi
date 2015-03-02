import java.util.Scanner;

public class TowerOfHanoi {
	/** Main metode */
	static int trekkTeller;
	public static void main(String[] args) {
		// Lager en scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn antall plater: ");
		int n = input.nextInt();

		// Finner løsningen ved bruk av rekursjon
		System.out.println("Trekkene er:");
		trekkTeller = 0;
		moveDisks(n, 'A', 'B', 'C');
		System.out.println("\nAntall trekk utført: " + trekkTeller);
	}

	/**
	 * Metoden for å finne løsningen for å bevege n plater fra fraTårn til
	 * tilTårn, ved bruk av auxTårn
	 */
	public static void moveDisks(int n, char fraTårn, char tilTårn, char auxTårn) {
		if (n == 1){ // stoppbetingelse
			System.out.println("Flytt plate " + n + " fra " + fraTårn + " til "
					+ tilTårn);
		}else {
			moveDisks(n - 1, fraTårn, auxTårn, tilTårn);
			System.out.println("flytt plate " + n + " fra " + fraTårn + " til "
					+ tilTårn);
			moveDisks(n - 1, auxTårn, tilTårn, fraTårn);
		}
		trekkTeller++;
	}
}