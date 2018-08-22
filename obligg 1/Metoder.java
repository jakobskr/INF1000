
import java.util.Scanner; //importer scanneren
class Metoder {//deklarerer metoden Metoder
  static void metodetest(){
    System.out.println("");
    System.out.println("SKriv inn navn:");
    Scanner scan = new Scanner(System.in);//lager scanner objectet
    String navn = scan.nextLine();//brikern skriver inn navnet
    System.out.println("Skriv inn bosted:");
    String by = scan.nextLine();//brukeren skriver inn byen
    System.out.println("Hei, " + navn + "! Du er fra " + by + ".");//programmet skriver ut by + navn
  }
  public static void main (String [] args) {
    metodetest();//kaller på metoden 3 ganger
    metodetest();
    metodetest();
}
}
