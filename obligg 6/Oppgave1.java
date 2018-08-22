class Oppgave1 {
  public static void main(String[] args) {
    Ord ord1 = new Ord("hundehus");//lager 2 nye object av klassen ord
    Ord ord2 = new Ord("toalett");
    ord1.oekAntall();//kaller paa oekAntall metoden paa ord1
    ord1.oekAntall();//kaller paa oekAntall metoden paa ord1
    System.out.println((new Ord("arne")).toString());//kaller paa toString metoden paa et nytt ord
    System.out.println(ord1.hentAntall());//kaller paa hentAntall
    System.out.println(ord2.hentAntall());//kaller paa hentAntall
    System.out.println(ord1.hentLengde());//kaller paa hentLengde
    System.out.println(ord1.plassiDokument());//kaller paa plassiDokument
    System.out.println(ord2.plassiDokument());//kaller paa plassiDokument

  }
}
