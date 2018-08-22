import java.util.ArrayList;//importerer arraylist

class Oppgave2 {

  public static void main(String[] args) throws Exception {
    Ordliste liste = new Ordliste();
    liste.lesBok("winnie.txt");//bruker winnie.txt til aa teste Ordliste classen.
    //liste.skrivUt();
    System.out.println("\n" + liste.finnOrd("which"));//sjekker om orded which er med i teksten
    System.out.println("Det er " + liste.antallOrd() + " unike ord i teksten.");//finner ut av hvor mane unike ord det er
    System.out.println(liste.antallForekomster("the"));
    Ord[] vanligsteFem = liste.vanligste5();//setter vanligsteFem som det vi finner i vanligste5
    //printer ut de vanligste 5 ordene
    System.out.println("De " + vanligsteFem.length + " mest vanligste ordene");

    for (int i = 0; i < vanligsteFem.length; i++ ) {
      System.out.println(vanligsteFem[i]);
    }

    System.out.println("Det lengste ordet er " + liste.finnLengste());//kaller paa finnLengste
    System.out.println("Det korteste ordet er " + liste.finnKorteste());//kaller paa finn korteste
    System.out.println("Det ordet som tar mest plass er " + liste.tarMestPlassIDokument());
    Ord[] vanligste = liste.alleVanligste();//setter vanligste som der vi finner i alleVanligste
    System.out.println("De " + vanligste.length + " mest vanligste ordene");
    //printer ut de vanligste ordene
    for (int i = 0; i < vanligste.length; i++ ) {
      System.out.println(vanligste[i]);
    }
  }
}
