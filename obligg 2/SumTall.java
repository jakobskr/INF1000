import java.util.Scanner;
class SumTall{

  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    int tall,sum;
    //setter en start verdi for å få programmet til å kjore. dette tallet kan være hva som helst bortsett fra 0.
    tall =-1;
    sum=0;
    //Loopen ber brukeren om å taste inn tallet 0, og plusser sammen alt det de taster inn. Loopen stopper når brukeren taster inn tallet 0
    while(tall != 0) {
      System.out.println("Skriv inn tallet 0!");
      tall = Integer.parseInt(scan.nextLine());
      sum = sum+tall;
    }
    //skriver ut summet av tallene som brukeren tastet inn
    System.out.println("Du skrev inn 0!");
    System.out.println("Summen av det du tastet inn ble: " + Integer.toString(sum));

  }
}
