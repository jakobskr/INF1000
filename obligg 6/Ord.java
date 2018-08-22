class Ord {
  private int antallGanger;
  private String ordet;
  Ord(String tekst) {//konstruktuerer objektet med det argumentet som blir gitt
    ordet = tekst;
    antallGanger = 1;
  }

  //returner ordet som string
  public String toString() {
    return ordet;
  }

  //returner hvor mange ganger ordet er i teksten
  public int hentAntall() {
    return antallGanger;
  }

  //oeker antallet med 1
  public void oekAntall() {
    antallGanger = antallGanger + 1;
  }

  //returnerer lengden til ordet
  public int hentLengde() {
    return ordet.length();
  }

  //returnerer hvor mye plass i dokumentet ordet tar
  public int plassiDokument() {
    return (antallGanger * ordet.length());
  }
}
