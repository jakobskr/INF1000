import java.util.Scanner;
import java.util.HashMap;
import java.io.File;

/* dvd administrasjon er hvor mesteparten av arbeidet skjer. den holder
oversikt over alle personene, og utforer metoder paa disse personene.
og leser ogsa inn fra dvdarkivet*/
public class DVDAdministrasjon {
  private HashMap <String, Person> personListe = new HashMap<String, Person>();
  private HashMap <String, DVD> dvdListe = new HashMap<String, DVD>();
  Scanner scan = new Scanner(System.in);

  //startet command loopen, og kjorer helt til brukeren taster inn 7
  public void program() throws Exception {
    int valg;
    skrivInn("dvdarkiv2.txt");//leser inn fra dvd arkivet
    while(true) {
      meny();//kaller paa meny for a skrive ut menyen etter hvert fullforte valg
      System.out.println("Skriv inn valget ditt");
      valg = sjekkOmTall();//kaller paa metoden for o sorge for aa faa valg
      if (valg == 1) {
        nyPerson();
      }
      else if (valg == 2) {
        kjop();
      }
      else if (valg == 3) {
        laan();
      }
      else if (valg == 4) {
        visPerson();
      }
      else if (valg == 5) {
        visOversikt();
      }
      else if (valg == 6){
        retur();
      }
      else if (valg == 7) {
        avslutt();
      }
    }
  }

  //sjekker om en perosn finens fra for av, og legger den til vis personen ikke finnes
  public void nyPerson() {
    System.out.println("Skriv inn navnet paa personen");
    String person = scan.nextLine().toLowerCase();
    if (!personListe.containsKey(person)) {
      personListe.put(person, new Person(person));
    }
    else {
      System.out.println("Denne personen finnes alt!");
    }
  }

  //legger til en dvd til personen vis personen finnes og dvd'en ikke finnes
  //(tolker oppgaven som max 1 av hver dvd)
  public void kjop() {
    System.out.println("Skriv inn hvem som skal kjope");
    String eier = scan.nextLine().toLowerCase();

    if (personListe.containsKey(eier)) {
      System.out.println("Skriv inn tittelen paa DVD'en du vil kjope");
      String tittel = scan.nextLine().toLowerCase();

      if (!dvdListe.containsKey(tittel)) {
        DVD dvd = new DVD(tittel, personListe.get(eier));
        personListe.get(eier).leggTilDVD(dvd);
        dvdListe.put(tittel, dvd);
      }

      else {
        System.out.println("Denne DVD'en eksisterer alt.");
      }
    }

    else {
      System.out.println("Denne personen finnes ikke");
    }
  }

  /*
  laaner ut fra person a til b, sjekker forst om b finnes, saa a,
  saa om dvden finnes. valgte aa ta hver if statement for seg selv for aa
  kunne gi konkrete tilbakemelding om "hva" som gikk galt.
  */
  public void laan() {
    if (personListe.size() > 1) {
      System.out.println("Hvem vil laane DVD'en?");
      String laaner = scan.nextLine().toLowerCase();

      if (personListe.containsKey(laaner)) {
        System.out.println("Hvem eier DVD'en?");
        String eier = scan.nextLine().toLowerCase();
        Person nyEier = personListe.get(eier);
        if (!eier.equalsIgnoreCase(laaner)) {

          if(personListe.containsKey(eier)) {

            if(personListe.get(eier).eierSize() > 0) {
              System.out.println("Hvilken DVD skal laanes?");
              String tittel = scan.nextLine().toLowerCase();

              if(nyEier.hentEierListe().containsKey(tittel)) {

                if (!nyEier.hentUtlaantListe().containsKey(tittel)) {

                  /*kaller paa laanut pa eier, laaner legger den til laaner listen,
                  og dvd'en setter en laaner referanse */
                  DVD dvd = nyEier.hentEierListe().get(tittel);
                  nyEier.laanUt(dvd);
                  personListe.get(laaner).leggTilLaaner(dvd);
                  System.out.println(laaner + " laaner naa " + tittel + " av " + eier);
                }

                else {
                  System.out.println(tittel + " er allerede utlaant.");
                }

              }

              else {
                System.out.println(eier + " eier ikke den DVD'en");
              }

            }

            else {
              System.out.println(eier + " har ingen DVD'er aa laane ut");
            }

          }

          else {
            System.out.println(eier + " finnes ikke i systemet");
          }

        }

        else {
          System.out.println("Man kan ikke laane fra seg selv!");
        }

      }

      else {
        System.out.println(laaner + " finnes ikke i systemet");
      }
    }

    else {
      System.out.println("Ikke nok personer til a kunne laane ut en DVD!");
    }

  }

  /* viser hvilke dvder en person  en eller alle personene eier/laaner/laaner ut
   paa hva brukeren oppgir (* elle navn) */
  public void visPerson(){
    System.out.println("Hvilken person vil du se?");
    String person = scan.nextLine().toLowerCase();
    if(person.equals("*")) {
      for(Person sample : personListe.values()) {
        sample.visInfo();
      }
    }
    if (personListe.containsKey(person)) {
      personListe.get(person).visInfo();
    }

    else {
      System.out.println("Den personen finnes ikke");
    }


  }

  //viser hvor mange dvd'er alle persone eier/laaner/laaner ut
  public void visOversikt() {
    System.out.println("\nPerson Oversikt:");

    for(Person person : personListe.values()) {
      System.out.println("\n" + person);
      System.out.println(person + " eier " + (person.eierSize() + person.utlaantSize()) + " DVD'er");
      System.out.println(person + " laaner ut " + person.utlaantSize() + " DVD'er");
      System.out.println(person + " laaner " + person.laanerSize() + " DVD'er");
    }
  }

  /*returnerer dvd'en som en bruker har laant. metoden sjekker om
  brukeren finnes, og om han har lant den angitte dvden*/
  public void retur() {
    System.out.println("Hvem skal returnere DVD'en?");
    String person = scan.nextLine().toLowerCase();
    if(personListe.containsKey(person)) {

      if (personListe.get(person).laanerSize() > 0) {
        System.out.println("Hvilken DVD skal returneres?");
        String tittel = scan.nextLine();
        DVD dvd = personListe.get(person).hentLaanerListe().get(tittel);

        if(personListe.get(person).hentLaanerListe().containsKey(tittel)) {
          personListe.get(person).fjernFraLaaner(personListe.get(person).hentLaanerListe().get(tittel));
          dvd.hentEier().faaTilbake(dvd);
        }

        else {
          System.out.println(person + " laaner ikke " + tittel);
        }

      }

      else {
        System.out.println(person + " laaner ikke noen DVD'er");
      }

    }
    else {
      System.out.println("Den personen finnes ikke");
    }

  }

  //skriver ut valgene brukeren har
  public void meny(){
    System.out.println("\nMeny");
    System.out.println("1. Legg til ny person");
    System.out.println("2. Kjop ny DVD");
    System.out.println("3. Laan bort DVD");
    System.out.println("4. Vis info om valgt person");
    System.out.println("5. Vis oversikt over personer");
    System.out.println("6. Returner DVD");
    System.out.println("7. Avslutt");
  }

  //Avslutter programmet
  public void avslutt() {
    System.out.println("Programmet avsluttes");
    System.exit(0);
  }

  //Sorger for at brukeren skriver inn et tall nar han skal velge et valg
  public int sjekkOmTall() {
    Scanner scan2 = new Scanner(System.in);
    int valg;
    while(true) {
      if(scan.hasNextInt()) {
        return valg = Integer.parseInt(scan.nextLine());
      }
      else {
        System.out.println("Du skrev ikke inn et tall");
        scan.nextLine();
      }
    }
  }

  //skriver inn fra fil,
  public void skrivInn(String filnavn) throws Exception{
    Scanner filScan = new Scanner(new File(filnavn));
    Person person;
    String next = filScan.nextLine().toLowerCase();

    //forst registrerer jeg personene
    while(!next.equals("-"))
    {

      if(!personListe.containsKey(next)) {
        personListe.put(next , new Person(next));
      }
      next = filScan.nextLine().toLowerCase();
    }
    person = personListe.get(filScan.nextLine().toLowerCase());

    //og saa legger jeg til dvdene til de personene som ble registrert
    while (filScan.hasNextLine()) {

      if(filScan.hasNextLine()) {
        next = filScan.nextLine().toLowerCase();
      }

      if (next.startsWith("-") && filScan.hasNextLine()) {
            person = personListe.get(filScan.nextLine().toLowerCase());
      }

      else if(next.startsWith("*")) {
        String tittel = next.substring(1).toLowerCase();

        if(!dvdListe.containsKey(tittel)) {
          DVD dvd = new DVD(tittel, person);
          String laner = filScan.nextLine().toLowerCase();
          Person laaner = personListe.get(laner);

          if(personListe.containsKey(laner)) {
            dvdListe.put(tittel,dvd);
            person.leggTilutlaant(dvd);
            laaner.leggTilLaaner(dvd);
          }

        }
      }

      else {
        if(!dvdListe.containsKey(next) && !next.equals("-")) {
          DVD dvd = new DVD(next, person);
          person.leggTilDVD(dvd);
          dvdListe.put(next, dvd);
        }
      }
    }
  }
} ////lukker klassen
