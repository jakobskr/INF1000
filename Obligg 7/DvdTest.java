/*
Denne testen lager ett objekt, setter en laaner
ogsa returnerer den navnet paa objecket, og eier + laaner
*/

public class DvdTest {
  public static void main (String[] args) {
    Person per = new Person("per");
    Person arne = new Person("arne");
    DVD dvd1 = new DVD("lotr", arne);
    dvd1.setLaaner(per);
    System.out.println(dvd1);
    System.out.println(dvd1.hentEier());
    System.out.println(dvd1.hentLaaner());
  }
}
