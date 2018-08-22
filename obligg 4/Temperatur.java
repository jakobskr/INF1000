import java.util.Scanner;
import java.io.File;
public class Temperatur {
  public static void main(String[] args) throws Exception {
    int tall1 = 0 ,i = 0;
    double gjennomsnitt = 0;
    File fil1 = new File("temperatur.txt"); //lager en ny fil variabel
    Scanner scan = new Scanner(fil1); //lager en scanner som scanner filen
    int [] tempArray;

    while(scan.hasNextLine()) { //teller hvor mange linjer det er
      i++;
      scan.nextLine();
    }

    fil1 = new File("temperatur.txt");
    scan = new Scanner(fil1);
    tempArray = new int[i];//lager en array med like mange plasser som linjer i filen
    i = 0;

    while(i < tempArray.length) { //putter temperaturene inn i arrayen
      tempArray[i] = Integer.parseInt(scan.nextLine());
      i++;
    }

    for(i=0; i < tempArray.length; i++) {
      tall1 = tall1 + tempArray[i];
    }
    gjennomsnitt =  Math.round((tall1 * 1.0 / i)*100) / 100.0d; //regner gjennomsnittet og runner av til 2 desimaler.
    System.out.println("\nGjennomnsnitts temperaturen er " + gjennomsnitt + " grader.");
  }

}
