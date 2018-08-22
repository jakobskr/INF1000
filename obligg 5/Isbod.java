class Isbod {
  int antallAnsatte = 0;
  String[] ansatte; //lager string arrayen
  String isbodNavn;

  //konstruktoren setter string lengden og navnet lik det som blir oppgitt i Oppgave54

  Isbod(int maksAntall, String navn) {
    ansatte = new String[maksAntall];//arrayen blir like lang som den forste parameteren.
    isbodNavn = navn;//navnet blir den andre parameteren
  }

  public void ansett(String navn) {
    if(antallAnsatte < ansatte.length) { //if statementen sjekker om det er nok plasser til aa ansette en ny person
      ansatte[antallAnsatte] = navn;
      antallAnsatte++;
      System.out.println(isbodNavn + ": Ansatte " + navn);//skriver ut hvilken isbod og hvilken person som ble ansatt
    }

    else { //vis det er ikke er plass til flere folk, saa gir programmet tilbake melding
      System.out.println("For mange ansatte! " + navn + " ble ikke ansatt" );
    }
  }

  //gir den nyeste ansatte sparken, programmet gir tilbake meldig
  public void giSisteAnsattSparken() {
    if(antallAnsatte > 0 ) { //sjekker forst om du har noen aa sparke.
      System.out.println(isbodNavn + ": Gir " + ansatte[antallAnsatte - 1] + " sparken.");
      ansatte[antallAnsatte - 1] = "";
      antallAnsatte = antallAnsatte -1;
    }
    else { //gir tilbake melding vis det ikke er noen aa sparke
      System.out.println(isbodNavn + ": Du har ingen ansatte aa sparke");
    }
  }

  //skriver ut alle ansatte i isboden
  public void printAnsatte() {
    System.out.println("\n" + isbodNavn + ":");
    if(antallAnsatte > 0){//sjekker om du har ansatte
      for (int i = 0; i < antallAnsatte ; i++ ) {
        System.out.println(ansatte[i]);
      }
    }
    else {//gir tilbakemelding dersom du ikke har noen ansatte
      System.out.println("Du har ingen ansatte!");
    }
    System.out.println("");//gjor commandlinjen mer oversiktelig
  }

  public String getName() {
    return isbodNavn;
  }
}
