class Oppgave54 {
  public static void main(String[] args) {

    //her lager jeg 3 objecter, med forskjellige antall ansatte og unikt navn
    Isbod minIsbod1 = new Isbod(6, "Pers Isbod");
    Isbod minIsbod2 = new Isbod(4, "Karls Isbod");
    Isbod minIsbod3 = new Isbod(1, "Alexandras Isbod");

    /*
    Her kaller jeg paa metodene for alle objektene, for aa teste at alt fungerer
    */
    minIsbod3.printAnsatte();
    minIsbod1.giSisteAnsattSparken();
    minIsbod1.ansett("arne");
    minIsbod1.ansett("preben");
    minIsbod1.ansett("Karl Ove Knausgaard");
    minIsbod1.ansett("Lisa");
    minIsbod1.ansett("Aslaug");
    minIsbod1.ansett("Kaare Willoch");
    minIsbod1.ansett("Theodor");
    minIsbod1.ansett("Pretzen");
    minIsbod1.printAnsatte();
    minIsbod1.giSisteAnsattSparken();
    minIsbod1.printAnsatte();
    minIsbod2.ansett("Willhelm");
    minIsbod2.ansett("arne");
    minIsbod2.ansett("Karl Ove Knausgaard");
    minIsbod2.printAnsatte();
    minIsbod3.ansett("Knut Alexendar Ryen");
    minIsbod3.ansett("Yehme");
    minIsbod3.ansett("Mohammad");
    minIsbod3.ansett("Aisha");
    minIsbod3.giSisteAnsattSparken();
    minIsbod3.ansett("Brad");
    minIsbod3.printAnsatte();
  }
}
