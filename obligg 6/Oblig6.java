import java.util.Scanner;

class Oblig6 {

  public static void main(String[] args) throws Exception {
    Ordliste liste = new Ordliste();
    liste.lesBok("scarlet.txt");//kaller paa lesBok med scarlet.txt som argument
    System.out.println("Det er " + liste.antallOrd() + " unike ord i teksten.");//skriver ut det vi faar naar vi kaller paa antallOrd
    System.out.println("det er " + liste.antallForekomster("Watson") + " forekomster av Watson");//skriver ut det vi faar naar vi kaller paa antallForekomster
    System.out.println("Det er " + liste.antallForekomster("elementary") + " forekomster av elementary");//skriver ut det vi faar naar vi kaller paa antallForekomster

    Ord[] vanligsteFem = liste.vanligste5();//setter vanligsteFem som der vi finner i vanligste5
    System.out.println("De 5 vanligste ordene er");//skriver ut de 5 vanligste ordene
    for (int i = 0; i < vanligsteFem.length; i++ ) {
      System.out.print(vanligsteFem[i] + " ");
    }

    System.out.println("\nDet lengste ordet er " + liste.finnLengste());//skriver ut det vi faar naar vi kaller paa finnLengste
    System.out.println("Det korteste ordet er " + liste.finnKorteste());//skriver ut det vi faar naar vi kaller paa finnKorteste
    System.out.println("Det ordet som tar mest plass er " + liste.tarMestPlassIDokument());//skriver ut det vi faar naar vi kaller paa tarMestPlassIDokument

    Ord[] vanligste = liste.alleVanligste();//setter vanligste som der vi finner i alleVanligste
    System.out.println("De " + vanligste.length + " mest vanligste ordene");
    //printer ut de vanligste ordene
    for (int i = 0; i < vanligste.length; i++ ) {
      System.out.println(vanligste[i]);
    }
  }
}
