import java.util.Scanner; //importer scanner metoden til java
class Beslutninger{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in); //lager et nytt scanner object
    System.out.println("Skriv inn alderen din!"); // ber brukeren skrive inn alderen sin
    int alder = sc.nextInt(); //deklarerer alder som det tallet brukeren skriver inn
    if(alder >= 18) { //hvis personen er 18 eller eldre saa skriver programmet ut at du er myndig
      System.out.println("Du er myndig");
    }
    else { //hvis personen er under 18 saa skriver programmet ut at personen ikke er myndig
      System.out.println("Du er ikke myndig");
    }
  }
}
