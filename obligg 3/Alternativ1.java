import java.util.Scanner;
public class Alternativ1 {

  /* programmet ber brukeren taste inn en tekst og en int variable, saa printer den ut
    teksten like mange ganger som tallet brukeren tastet inn.
  */
  public static void main (String [] args) {
    int tall1 = 0;
    Scanner scan = new Scanner(System.in);
    int i = 0;

    //while loopen looper helt til brukeren taster inn et tall storre enn 0
    while(true) {
      System.out.println("Skriv inn tall: ");

      if(scan.hasNextInt()) {
        tall1 = scan.nextInt();
        if(tall1 > 0) {
          scan.nextLine();
          break;
        }

        else {
          System.out.println("Tallet maa vaere stoerre en 0)");
        }

      }

        else {
          System.out.println("Du skrev ikke inn et tall, prov igjen");
        }

        scan.nextLine();
    }


    System.out.println("Skriv inn teksten: ");
    String tekst = scan.nextLine();
    skrivTekster(tekst,tall1); //kaller paa metoden
  }

  /*jeg ville lage en if statement, som sjekker om en teller er lik 3 (telleren oker med 1 for hver gang
  tekst printes), vis telleren er lik 3 saa printer ut programmet en tom linje.
  */

//metoden skriver ut tekst like mange ganger som antall.
  static void skrivTekster(String tekst, int antall) {
    int i = 0;
    int linjer = 0;
    System.out.println("\nResultatet:\n");

    while(i < antall) {
      System.out.println(tekst);
      i++;
      linjer++;

      //if stamement printer ut en tom linje, hver 3. gang
      if(linjer == 3) {
        System.out.println("");
        linjer = 0;
      }

    }
  }
}
