/* denne testen sjekker at laaning fungerer, og at visinfo viser den oppdaterte infoen */

public class PersonTest {
  public static void main (String[] args) {
    Person arne = new Person("arne");
    Person per = new Person("per");
    arne.visInfo();
    DVD dvd = new DVD("lotr", arne);
    arne.leggTilDVD(dvd);
    arne.laanUt(dvd);
    per.leggTilLaaner(dvd);
    arne.visInfo();
    //per.visInfo();
    System.out.println(dvd.hentEier());
  }
}
