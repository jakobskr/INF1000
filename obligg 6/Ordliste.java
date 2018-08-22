import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class Ordliste {

  private ArrayList<Ord> list = new ArrayList<Ord>();

  //leser gjennom en fil, og legger til alle ordene i en ordliste
  public void lesBok(String filnavn) throws Exception {
    Scanner filScan = new Scanner(new File(filnavn));
    while (filScan.hasNextLine()) {
      leggTilOrd(filScan.nextLine());
    }
  }

  //legger til ordet i teksten vis det ikke finnes. Vis det finnes saa kaller den paa oekAntall metoden.
  private void leggTilOrd(String ord) {
    Boolean sjekk = false;
    for (Ord sample: list) {
      if(sample.toString().equalsIgnoreCase(ord)) {
        sample.oekAntall();
        sjekk = true;
        break;
      }
    }
    //
    if (sjekk == false) {
      list.add(new Ord(ord));
    }
  }

  //skriver ut alle ordene i teksten til commandlinjen, hvorfor jeg vil det er et personling spoersmaal.
  public void skrivUt() {
    for (Ord sample : list) {
      System.out.println(sample);
    }
  }

  //finner ut om tekst er med i teksten. og returnerer svaret.
  public Ord finnOrd(String tekst) {
    for(Ord sample : list) {
      if(tekst.equalsIgnoreCase(sample.toString())) {
        return sample;
      }
    }
    return null;
  }

  //returnerer antall unike ord i teksten
  public int antallOrd() {
    return list.size();
  }

  //returner hvor mange ganger tekst dukker opp i teksten
  public int antallForekomster(String tekst) {
    for (Ord sample : list) {
      if (tekst.equalsIgnoreCase(sample.toString())) {
        return sample.hentAntall();
      }
    }
    return 0;
  }

  //returnerer en array som inneholder de 5 mest vanlisgte ordene i teksten.
  public Ord[] vanligste5() {
    Ord[] vanligste = new Ord[5];
    int tempMaks = 0, tempPos = 0;
    for (int x = 0; x < vanligste.length ; x++ ) {
      tempMaks = 0;
      tempPos = 0;
      for (Ord sample : list) { //kaller paa ordSjekk, for aa sjekke om ordet vi fant er i arrayen fra foer av
        if(ordSjekk(sample, vanligste) == false) {
          if (tempMaks < sample.hentAntall() ) {
            vanligste[x] = sample;
            tempMaks = sample.hentAntall();
            tempPos = list.indexOf(sample);
          }
        }
      }
    }
    return vanligste;
  }

  //sjekker om ordet er i arreyen fra foer av.
  private Boolean ordSjekk(Ord innOrd, Ord[] ordArray) {
    for (int i = 0; i < ordArray.length; i++ ) {
      if (ordArray[i] == innOrd) {
        return true;
      }
    }
    return false;
  }

//finner og returnerer det ordet i teksten som er lengst
  public Ord finnLengste() {
    int tempMaks = 0;
    int tempPos = 0;
    for (Ord sample : list) {
      if (sample.hentLengde() > tempMaks) {
        tempMaks = sample.hentLengde();
        tempPos = list.indexOf(sample);
      }
    }
    return list.get(tempPos);
  }

  //finner og returnerer det ordet i teksten som er kortest
  public Ord finnKorteste() {
    int tempMaks = 99;
    int tempPos = 0;
    for (Ord sample : list) {
     if (sample.hentLengde() < tempMaks) {
       tempMaks = sample.hentLengde();
       tempPos = list.indexOf(sample);
     }
   }
   return list.get(tempPos);
  }

  //fiinner og returnerer det ordet i teksten som tar mest plass
  public Ord tarMestPlassIDokument() {
    int tempMaks = 0;
    int tempPos = 0;
    for (Ord sample : list) {
      if (sample.plassiDokument() > tempMaks) {
        tempMaks = sample.plassiDokument();
        tempPos = list.indexOf(sample);
      }
    }
    return list.get(tempPos);
  }

  //finner og returnerer det eller de ordene som forekommer flest ganger i boken
  public Ord[] alleVanligste() {
    int tempMaks = 0, tempPos = 0, teller = 0;
    for (Ord sample : list) { //foers finner vi det stoerste antallet av ord i teksten
        if (tempMaks < sample.hentAntall() ) {
          tempMaks = sample.hentAntall();
          tempPos = list.indexOf(sample);
          teller = 0;
        }
        if (tempMaks == sample.hentAntall()) {
            teller++;
        }
    }

    Ord[] vanligste = new Ord[teller];
    for (int i = 0; i < vanligste.length; i++) {//saa putter vi ordene inn i en array
      for (Ord sample : list) {
        if(ordSjekk(sample, vanligste) == false) {//sjekker om ordet allerede er arrayen.
          if (tempMaks == sample.hentAntall() ) {
            vanligste[i] = sample;
          }
        }
      }
    }
   return vanligste;
  }

}//slutten av klassen
