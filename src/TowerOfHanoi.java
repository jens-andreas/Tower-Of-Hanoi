import java.util.Scanner; 

public class TowerOfHanoi {
  /** Main metode */
  public static void main(String[] args) {
    // Lager en scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of disks: ");
    int n = input.nextInt();

    // Finner l�sningen ved bruk av rekursjon
    System.out.println("The moves are:");
    moveDisks(n, 'A', 'B', 'C');
  }

  /** Metoden for � finne l�sningen for � bevege n disker
      fra fraT�rn til tilT�rn, ved bruk av auxT�rn */
  public static void moveDisks(int n, char fraT�rn,
      char tilT�rn, char auxT�rn) {
    if (n == 1) // stoppbetingelse
      System.out.println("Move disk " + n + " from " +
    		  fraT�rn + " to " + tilT�rn);
    else {
      moveDisks(n - 1, fraT�rn, auxT�rn, tilT�rn);
      System.out.println("Move disk " + n + " from " +
    	fraT�rn + " to " + tilT�rn);
      moveDisks(n - 1, auxT�rn, tilT�rn, fraT�rn);
    }
  }
}