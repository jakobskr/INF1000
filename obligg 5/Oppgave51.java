import java.util.Scanner;
class Oppgave51 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Bil bil = new Bil(60,60,0.06,0);//lager ett nytt objeck kalt bil1, og gir den verdiene som staar i parantesene
    Bil bil2 = new Bil(120,120,0.06,0);//gjor det samme som over

    /*programmet under er ikke saa veldig intresant, siden vi bare tar aa kaller paa de forskjellige medotdene paa begge objektene med
      verdier inntastet fra brukeren. programmet sjekker om verdiene er gyldige. vis de er det saa utforer programmet metodene.*/

    System.out.println("Skriv inn hvor langt du vil kjore!");
    if(bil.kjorTur(scan.nextInt())==true) {
      System.out.println("Du kjorte turen");
    }
    else {
      System.out.println("Du hadde ikke nok bensin");
    }
    System.out.println("Skriv inn hvor langt du vil kjore!");

    if(bil2.kjorTur(scan.nextInt())==true) {
      System.out.println("Du kjorte turen");
    }
    else {
      System.out.println("Du hadde ikke nok bensin");
    }
    System.out.println("Skriv inn hvor mange litre du vil fylle.");
    if(bil.fyllTank(scan.nextInt())==true) {
      System.out.println("Du fylte inn bensin");
    }
    else {
      System.out.println("Du faar ikke plass til bensinen.");
    }

    System.out.println("Skriv inn hvor mange litre du vil fylle.");
    if(bil2.fyllTank(scan.nextInt())==true) {
      System.out.println("Du fylte inn bensin");
    }
    else {
      System.out.println("Du faar ikke plass til bensinen.");
    }
    System.out.println("Bil 1 kan kjore " + bil.hentMaksDistanse() + "km");
    System.out.println("Bil 2 kan kjore " + bil2.hentMaksDistanse() + "km");
    System.out.println("Bil 1 har kjort " + bil.hentKilometerstand() + "km");
    System.out.println("Bil 2 har kjort " + bil2.hentKilometerstand() + "km");
  }
}
