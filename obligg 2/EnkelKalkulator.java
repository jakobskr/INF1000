import java.util.Scanner;
class EnkelKalkulator {
  public static void main (String [] args) {

    int tall1,tall2;
    //ber brukeren taste inn to tall, og setter talle til tall1 og tall2.
    Scanner scan = new Scanner(System.in);
    System.out.println("Skriv inn tall1");
    tall1 =  Integer.parseInt(scan.nextLine());
    System.out.println("Skriv inn tall2");
    tall2 =  Integer.parseInt(scan.nextLine());

    //Kaller paa metodene med parameterne tall1 og tall 2
    pluss(tall1, tall2);
    minus(tall1, tall2);
    gange(tall1, tall2);

}

  //plusser tallene sammen og skriver ut summen
  static void pluss(int plu1, int plu2) {
    System.out.println("\nSummen er: " + Integer.toString(plu1 + plu2));
  }

  //trekker tallene fra hverandre og skriver ut differansen
  static void minus(int min1, int min2) {
    System.out.println("Differansen er: " + Integer.toString(min1 - min2));
  }

  //ganger talleme sammen og skriver ut produktet
  static void gange(int pro1, int pro2) {
    System.out.println("Produktet er: " + Integer.toString(pro1 * pro2));
  }

}
