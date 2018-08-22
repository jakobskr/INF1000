import java.util.Scanner; //importerer skanneren
class LikeVerdier{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in); //lager et skanner object
    System.out.println("Skriv inn C"); //ber brukeren skrive inn verdi C
    int c = sc.nextInt(); //brukeren skriver inn c
    System.out.println("Skriv inn D"); //ber brukeren skrive inn verdi d
    int d = sc.nextInt();//brukeren skriver inn verdi d
    if(c == d)  { //sjekket om c og d er like, vis de er like skriver programmet ut "C og d er like"
      System.out.println("C og D er like");
    }
    else  {//og skriver ut "C og D er ikke like" vis de ikke er like
      System.out.println("C og D er ikke like");
    }
  }
}
