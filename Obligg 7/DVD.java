/*
  DVD klassen er der hvor informasjonen til hvert dvd objeckt blir lagret
  Den holder styr paa hva dvd'en heter, hvem som eier dvd'en og eventuelt hven som
  laaner dvden. og den har metoder osm returnerer relevant info.
*/

public class DVD {
  private String tittel;
  private Person eier;
  private Person laaner;
  public DVD(String tittel, Person eier) {
    this.tittel = tittel;
    this.eier = eier;
  }

  //returnerer navnet
  public String toString() {
    return tittel;
  }

  //returnerer eieren
  public Person hentEier() {
    return eier;
  }

  //returenerer hven som laaner
  public Person hentLaaner() {
    return laaner;
  }

  //setter en referanse til laanereren
  public void setLaaner(Person laaneren) {
    laaner = laaneren;
  }

  //fjerner laanerreferansen fra dvd
  public void fjernLaaner() {
    laaner = null;
  }

}
