import java.util.Scanner;

public class TowerOfHanoi {
	/** Main metode */
	static int trekkTeller;
	public static void main(String[] args) {
		// Lager en scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn antall plater: ");
		int n = input.nextInt();

		// Finner l�sningen ved bruk av rekursjon
		System.out.println("Trekkene er:");
		trekkTeller = 0;
		moveDisks(n, 'A', 'B', 'C');
		System.out.println("\nAntall trekk utf�rt: " + trekkTeller);
	}

	/**
	 * Metoden for � finne l�sningen for � bevege n plater fra fraT�rn til
	 * tilT�rn, ved bruk av auxT�rn
	 */
	public static void moveDisks(int n, char fraT�rn, char tilT�rn, char auxT�rn) {
		if (n == 1){ // stoppbetingelse
			System.out.println("Flytt plate " + n + " fra " + fraT�rn + " til "
					+ tilT�rn);
		}else {
			moveDisks(n - 1, fraT�rn, auxT�rn, tilT�rn);
			System.out.println("flytt plate " + n + " fra " + fraT�rn + " til "
					+ tilT�rn);
			moveDisks(n - 1, auxT�rn, tilT�rn, fraT�rn);
		}
		trekkTeller++;
	}
}