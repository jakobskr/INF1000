import java.util.Scanner;
import java.io.File;
class Valg {
  public static void main(String [] args) throws Exception {
    File fil = new File("stemmer.txt");
    Scanner scan = new Scanner(fil);
    int teller = 0, i = 0;
    String[] stemmeArray;
    int[] stemmeteller = {0,0,0,0};
    String[] oversikt = {"ap", "h", "krf","sp"};

    while(scan.hasNextLine()) {
      teller++;
      scan.nextLine();
    }
    stemmeArray = new String[teller];

    fil = new File("stemmer.txt");
    scan = new Scanner(fil);

    for (i = 0; i < stemmeArray.length; i++ ) {
      stemmeArray[i] = scan.nextLine();
    }

    for (i = 0; i < stemmeArray.length ;i++ ) {

      if(stemmeArray[i].equalsIgnoreCase(oversikt[0])) {
        stemmeteller[0] = stemmeteller[0] + 1;
      }

      else if(stemmeArray[i].equalsIgnoreCase(oversikt[1])) {
        stemmeteller[1] = stemmeteller[1] + 1 ;

      }

      else if(stemmeArray[i].equalsIgnoreCase(oversikt[2])) {
        stemmeteller[2] = stemmeteller[2] + 1;

      }

      else if(stemmeArray[i].equalsIgnoreCase(oversikt[3])) {
        stemmeteller[3] = stemmeteller[3] +1;
      }
    }

    i = 0;
    while(i<stemmeteller.length) {
      System.out.println("antall stemmer for " + oversikt[i] + " " + stemmeteller[i]);
      i++;
    }
    int temp = 0;
    int vinner = -1;
    for (i = 0; i<stemmeteller.length; i++) {
      if(stemmeteller[i]>temp) {
        temp = stemmeteller[i];
        vinner = i;
      }
    }
      System.out.println("vinneren er " + oversikt[vinner]);
  }
}
