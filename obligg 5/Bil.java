public class Bil {
  private double tank, maks, forbruk, distanse;
  Bil(double maks, double tank, double forbruk, double distanse) {//lager en konstroktor som gir de nye bilene verdier som er hentet fra det andre programmet
    this.tank = tank; //bruker this.variabel siden jeg ikke hadde lyst til aa lage nye variabler
    this.maks = maks;
    this.forbruk = forbruk;
    this.distanse = distanse;
  }

  //sjekker om bilen har nok bensin til aa kjore turen som brukeren oppgir, vis den har nok bensin saa kjorer bilen turen og bruker bensin.
  public boolean kjorTur(int km) {
    if(tank >= (km * forbruk)) {
      distanse = distanse + km;
      tank = tank - km * forbruk;
      return true;
    }
    else {
      return false;
    }
  }

  //fyller opp bilen med like mange liter som kunden oppgir, saa lenge kunden gir et tall som vil overfylle bilen med bensin
  public boolean fyllTank(double liter) {
    if (maks >= tank + liter) {
      tank = tank + liter;
      return true;
    }
    else {
      return false;
    }
  }

  //henter den maksimale kjoredistansen til bilen.
  public double hentMaksDistanse() { return tank/forbruk; }

  //henter hvor langt bilen har kjort totalt
  public double hentKilometerstand() { return distanse; }
}
