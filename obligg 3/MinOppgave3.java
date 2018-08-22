import java.util.Scanner;
public class MinOppgave3 {
  public static void main (String [] args) {
    int [] tallArray = new int[6];
    Scanner scan = new Scanner(System.in);
    int i = 0;
    int valg;

    while(i < tallArray.length) { //putter tallene som brukeren, skriver inn i en array,
      System.out.println("Skriv inn det " + (i+1) + ". tallet" );

        //soerger for at brukeren skriver inn ett tall, og ber dem om aa gjoere det paa nytt vis de ikke skriver inn ett tall
      while(true) {
        if(scan.hasNextInt()) {
          tallArray[i] = scan.nextInt();
            scan.nextLine();
            break;//stopper loopen siden kravene er oppfylt
        }

        else {
          System.out.println("Du skrev ikke inn ett tall, prov igjen");
        }

          scan.nextLine();
      }

      i++;
    }

    print(); //kaller paa meny metoden

    //er det feil aa bruke while(true)?
    while(true) { //brukeren velger mellom 1 og 2, og programmet gaar ikke videre for 1 or 2 er oppgitt.
      if(scan.hasNextInt()) {
        valg=scan.nextInt();
        if(valg == 1) {
          sortFraStorst(tallArray);
          break; //stopper loopen siden kravene er oppfylt
        }

        else if (valg == 2) {
          sortFraMinst(tallArray);
          break; //stopper loopen siden kravene er oppfylt
        }

        else{
          System.out.println("Feil valg");
          scan.nextLine(); //clearer scan bufferen
        }

      }

      else {
        System.out.println("Feil valg");
        scan.nextLine(); //samme som me de andre
      }
    }

    i = 0;
    System.out.println("Sortert Array");

    //denne loopen printer ut den sorterte arrayen
    while(i<tallArray.length) {
      System.out.println(tallArray[i]);
      i++;
    }

  }

  //sorterer arrayen fra storst til minst, for aa saa returnere den sortere arrayen
  static int[] sortFraStorst (int [] sorterArray) {
    int temp;

    for( int j = 0; j < sorterArray.length - 1; j++){

      if(sorterArray[j]<sorterArray[j+1]){
        temp = sorterArray[j];
        sorterArray[j] = sorterArray[j+1];
        sorterArray[j+1] = temp;
        j=-1;
      }
    }

    return sorterArray;
  }

  //sorterer arrayen fra minst til storst, for aa saa returnere den sortere arrayen
  static int[] sortFraMinst (int [] sorterArray) {
    int temp;

    for( int i = 0; i < sorterArray.length - 1; i++){

      if(sorterArray[i]>sorterArray[i+1]){
        temp = sorterArray[i];
        sorterArray[i] = sorterArray[i+1];
        sorterArray[i+1] = temp;
        i=-1;
      }
    }

    return sorterArray;
  }

  //printer ut en meny
  static void print(){
    System.out.println("Tast 1 for storst til minst");
    System.out.println("Tast 2 for minst til storst");
  }

}
