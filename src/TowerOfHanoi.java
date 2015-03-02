import java.util.Scanner; 

public class TowerOfHanoi {
  /** Main metode */
  public static void main(String[] args) {
    // Lager en scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of disks: ");
    int n = input.nextInt();

    // Finner løsningen ved bruk av rekursjon
    System.out.println("The moves are:");
    moveDisks(n, 'A', 'B', 'C');
  }

  /** Metoden for å finne løsningen for å bevege n disker
      fra fraTårn til tilTårn, ved bruk av auxTårn */
  public static void moveDisks(int n, char fraTårn,
      char tilTårn, char auxTårn) {
    if (n == 1) // stoppbetingelse
      System.out.println("Move disk " + n + " from " +
    		  fraTårn + " to " + tilTårn);
    else {
      moveDisks(n - 1, fraTårn, auxTårn, tilTårn);
      System.out.println("Move disk " + n + " from " +
    	fraTårn + " to " + tilTårn);
      moveDisks(n - 1, auxTårn, tilTårn, fraTårn);
    }
  }
}