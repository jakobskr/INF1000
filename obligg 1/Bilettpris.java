import java.util.Scanner; //importerer scanner metoden
class Bilettpris
    {public static void main (String[] args){
      Scanner sc = new Scanner(System.in); //lager et nytt scanner object
      System.out.println("Skriv inn alderen din!"); // ber brukeren skrive inn alderen sin
      int alder = sc.nextInt(); //deklarerer alder som det tallet brukeren skriver inn, kan ogs bruke int alder = Integer.parseInt(sc.nextLine());
      if(alder<12 || alder>67){ //vis personen er uner 12 eller over 67 aar gammel, saa for de biletten til redusert pris.
        System.out.println("Biletten koster 25 kr");
      }
      else{
        System.out.println("Biletten koster 50 kr");
      }
  }
}
