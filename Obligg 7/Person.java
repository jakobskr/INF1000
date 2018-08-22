import java.util.HashMap;

/*
Person Klassen holder styr paa hva personen heter,
og hvilke dvder han eier/laaner/laaner ut. og
*/

public class Person{
  private String navn;
  public Person(String navn){
    this.navn = navn;
  }
  private HashMap <String,DVD> eierListe = new HashMap<String, DVD>();
  private HashMap <String,DVD> utlaantListe = new HashMap<String, DVD>();
  private HashMap <String,DVD> laanerListe = new HashMap<String, DVD>();

  //returnerer navnet
  public String toString() {
    return navn;
  }

  //returnerer hashmappet sa man kan bruke det i dvd admin
  public HashMap<String,DVD> hentEierListe() {
    return eierListe;
  }

  //returnerer hashmappet sa man kan bruke det i dvd admin
  public HashMap<String,DVD> hentUtlaantListe() {
    return utlaantListe;
  }

  //returnerer hashmappet sa man kan bruke det i dvd admin
  public HashMap<String,DVD> hentLaanerListe() {
    return laanerListe;
  }

  //returnerer storrlesen
  public int eierSize() {
    return eierListe.size();
  }

  //returnerer storrelsen
  public int utlaantSize() {
    return utlaantListe.size();
  }

  //returnerer storrelsen
  public int laanerSize() {
    return laanerListe.size();
  }

  //legger til eier listen
  public void leggTilDVD(DVD dvd) {
    eierListe.put(dvd.toString(), dvd);
  }

  //legger til utlaant listen
  public void leggTilutlaant(DVD dvd) {
    utlaantListe.put(dvd.toString(), dvd);
  }

  //legger til laaner listen
  public void leggTilLaaner(DVD dvd) {
    this.laanerListe.put(dvd.toString(), dvd);
    dvd.setLaaner(this);
  }

  //laaner ut en dvd, dvs fjerener fra eier og putter paa laaner ut
  public void laanUt(DVD dvd) {
    eierListe.remove(dvd.toString());
    utlaantListe.put(dvd.toString(), dvd);
  }

  //faar en dvb tilbake, dvs fjerner fra utlaan og putter paa eier
  public void faaTilbake(DVD dvd) {
    utlaantListe.remove(dvd.toString(), dvd);
    eierListe.put(dvd.toString(), dvd);
  }

  //fjerener dvden fra laaner listen
  public void fjernFraLaaner(DVD dvd) {
    laanerListe.remove(dvd.toString());
    dvd.fjernLaaner();
  }

  //skriver ut alle dvd'ene personen eier/laaner ut /laaner
  public void visInfo() {
    if(eierListe.size() > 0) {
      System.out.println("\n" + navn + " eier disse DVD'ene!");
      skrivUthash(eierListe);
    }

    else {
      System.out.println("\n" + navn + " eier ingen DVD'er!");
    }

    if(utlaantListe.size() > 0) {
      System.out.println("\n" + navn + " laaner ut disse DVD'ene!");

      for(DVD dvd : utlaantListe.values()) {
        System.out.println("laaner ut " + dvd + " til " + dvd.hentEier());
      }
    }

    else {
      System.out.println("\n" + navn + " laaner ikke ut noen DVD'er.");
    }

    if(laanerListe.size() > 0) {
      System.out.println("\n" + navn + " laaner disse DVD'ene!");

      for(DVD dvd : laanerListe.values()) {
        System.out.println("laaner " + dvd + " av " + dvd.hentEier());
      }
    }

    else {
      System.out.println("\n" + navn + " laaner ikke noen DVD'er");
    }
  }

  //en hjelpe metode som jeg bruker for aa skrive ut hashmaps.
  public void skrivUthash(HashMap<String, DVD> liste) {

    for(DVD dvd : liste.values()) {
      System.out.println(dvd);
    }
  }

}
