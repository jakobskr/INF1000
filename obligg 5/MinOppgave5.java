//denne oppgave bruker ogsa Isbod.java
import java.util.Scanner;
class MinOppgave5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int delValg = -1, valg = -1;
    Isbod[] isbodArray = new Isbod[3];//lager en Isbod array med 3 plasser
    for (int i = 0; i < isbodArray.length; i++ ) {
      isbodArray[i] = new Isbod(antallAnsatte(scan) , isbodNavngi(scan)); //fyller opp plassene ved hjelp av en for loop og metoder med parametre
    }

    while(true) {//Denne loopen er hovedprogammet, og sorger for at programmet kjorer helt til brukeren stopper det.
      valg = printOgVelg(isbodArray, valg, scan);//kaller paa printOgVelg metoden
      if (valg == 1) {//vis valg = 1 saa jobber vi med den forste isboden
          printOgVelg2(isbodArray, valg, scan);
          valg = -1;//her setter vi valg = -1 for aa unngaa at vi ikke gaar tilbake til den samme isboden igjen
      }

      else if(valg == 2) {//hvis valg == 2 saa jobber vi med den andre isboden
        printOgVelg2(isbodArray, valg, scan);
        valg = -1;
      }

      else if(valg == 3 ) {//valg == 3 saa jobber vi med den tredje isboden
          printOgVelg2(isbodArray, valg, scan);
          valg = -1;
      }
      else if (valg == 0) {
        System.out.println("Programmet avsluttes, takk for i dag.");
        break;
      }
    }//lukker den forste while loopen

  }//lukker mainen

  //for aa sette hvor mange ansatte en isbod kan ha
  public static int antallAnsatte (Scanner scan) {
    System.out.println("Skriv inn hvor mange ansatte boden skal ha.");
    return Integer.parseInt(scan.nextLine());
  }

  //for aa navngi isboden
  public static String isbodNavngi (Scanner scan) {
    System.out.println("Skriv hva boden skal hete.");
    return scan.nextLine();
  }

  //printer ut menyen med en for loop, og saa velger brukeren hvilken av isboden han vil jobbe med
  public static int printOgVelg(Isbod[] isbodArray, int valg, Scanner scan) {
    System.out.println("Velg hvilken isbod du vil jobbe med!");

    for (int i = 0; i < isbodArray.length; i++ ) {
      System.out.println((i+1) + ". " + isbodArray[i].getName());
    }

    System.out.println("0. Avslutt programmet");
    return valg = Integer.parseInt(scan.nextLine());
  }

  //denne metoden printer ut operasjonene brukeren kan gjore paa den valgte isboden, og saa velger brukeren hva han vil gjore.
  public static void printOgVelg2(Isbod[] isbodArray, int valg, Scanner scan) {
    System.out.println("velg operasjon for " + isbodArray[valg - 1]);
    System.out.println("1. Ansett ny person");
    System.out.println("2. Gi siste ansatt sparken");
    System.out.println("3. Print ut oversikt ");
    System.out.println("0. Gaa tilbake til hovedmenyen");
    int operasjonValg;

    while(true) {
      operasjonValg = Integer.parseInt(scan.nextLine());//bruker skriver inn valget sitt

      if (operasjonValg == 1) {
        System.out.println("Skriv inn navnet paa den nye ansatte");
        isbodArray[valg - 1].ansett(scan.nextLine());//kaller paa ansett metoden
      }

      else if (operasjonValg == 2) {
        isbodArray[valg -1 ].giSisteAnsattSparken();//kaller paa sparke metoden
      }

      else if (operasjonValg == 3) {
        isbodArray[valg - 1].printAnsatte();//kaller paa print alle ansatte metoden
      }

      else if (operasjonValg == 0) {
        break;
      }
      System.out.println("Velg ny operasjon");
    }
  }
}//lukker classen
