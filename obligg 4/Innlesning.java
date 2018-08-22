import java.util.Scanner;
import java.io.File;
public class Innlesning {
  public static void main(String[] args) throws Exception {
    File fil1 = new File("winnie.txt");
    Scanner innscan = new Scanner(System.in);
    String ord = "winnie-the-pooh";
    sjekk(ord,fil1);
    System.out.println("\nSkriv inn order du vil sjekke!");
    ord = innscan.nextLine();
    sjekk(ord,fil1);
  }

  public static void sjekk(String ordet, File fil) throws Exception {
    Scanner filscan = new Scanner(fil);
    int teller = 0;

    while(filscan.hasNextLine()) {

      if(filscan.next().equalsIgnoreCase(ordet)) {
        teller++;
      }

      filscan.nextLine();
    }

    System.out.println("\n" + ordet + " forekommer " + teller + " ganger i teksten.");
  }
}
