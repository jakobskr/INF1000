import java.util.Scanner;
class MinOppgave2 {

  public static void main (String [] args) {
    int tall = 0;

    //while loopen kjorer helt til brukeren skriver inn tallet 3
    while(tall != 3) {
      //bruker en medtode med parameter
      tall = skriv(tall);
    }
    System.out.println("Du skrev inn 3!");
  }

  //deklarer metoden med parameteret tall.
  public static int skriv(int tall) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Skriv inn tallet 3");
    tall = scan.nextInt();

    //hvis tallet ikke er lik 3, saa gir programmet tilbake melding til brukrenen.
    if (tall != 3) {
      System.out.println("Du skrev ikke inn 3 :/");
      System.out.println("Prov igjen!");
      System.out.println("");
      return tall;
    }

    //hvis tallet er 3 saa returneren den tall variablen
    else {
      tall = 3;
      return tall;
    }
  }
}
