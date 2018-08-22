import java.util.Scanner;
public class FirstArray {

  public static void main (String [] args) {

    Scanner scan = new Scanner(System.in);
    //deklarer 2 arrays, en string og en int. int arrayen har 4 plasser, og stringen har 5
    int [] tallArray = new int[4];
    String [] navnArray = new String [5];
    int i = 0;

    //while loopen setter inn tallene 0,1,2,3 inn i tallArray
    while (i < tallArray.length) {
      tallArray[i] = (i);
      i++;
    }
    //setter manuelt 0. og 3. plass til 1337 i tallArray
    tallArray[0] = 1337;
    tallArray[3] = 1337;
    i=0;

    //while loppen ber brukeren om aa skrive inn 5 navn, og putter navnene brukeren skrev inn i arrayen
    while (i < navnArray.length) {
      System.out.println("Skriv inn navn " + (i + 1)); //Integer.toString
      navnArray[i]=(scan.nextLine());
      i++;
    }

    System.out.println("");
    i = 0;
    System.out.println("Int arrayen:");

    //skriver ut int arrayen ved hjelp av en while loop
    while (i < tallArray.length){
      System.out.println(tallArray[i]);
      i++;
    }

    System.out.println("");
    i = 0;
    System.out.println("String arrayen:");

    //skriver ut string arrayen ved hjelp av en while loop
    while (i < navnArray.length) {
      System.out.println(navnArray[i]);
      i++;
    }

  }
}
