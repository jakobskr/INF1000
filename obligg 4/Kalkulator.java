import java.util.Scanner;
class Kalkulator {
  public static void main (String [] args) {
    int addSvar = addisjon(3,4);
    System.out.println("Summen er " + addSvar);
    int subSvar = subtraksjon(5,2);
    System.out.println("Differansen er " + subSvar);
    int helDivSvar = heltalldivisjon(10,3);
    System.out.println("Kvotienten er " + helDivSvar);
    double divSvar = divisjon(10,3);
    System.out.println("Kvotienten er " + Math.round((divSvar) * 100) / 100.0d);

  }

  public static int addisjon(int tall1, int tall2) {
    int tall3 = tall1 + tall2;
    return tall3;
  }

  public static int subtraksjon(int tall1, int tall2) {
    int tall3 = tall1 - tall2;
    return tall3;
  }

  public static int heltalldivisjon(int tall1, int tall2) {
    int tall3 = tall1 / tall2;
    return tall3;
  }

  public static double divisjon(double tall1, double tall2) {
    double tall3 = tall1 / tall2;
    return tall3;
  }
}
