public class NegativeTall {
  public static void main(String[] args) {
    int[] heltall = {1, 4, 5, -2, -4, 6, 10, 3, -2};
    int i = 0;
    int negativ = 0;

    //kjorer gjennom og sjekker hele int arrayen
    while(i < heltall.length) {

      //sjekker om tallet er negativ, og erstatter det med posisjonen vis det er negativt
      if(heltall[i]<0) {
        negativ++;
        heltall[i]=i;
      }
      i++;
    }
    System.out.println("Det er  " + i + " negative tall i arrayen.");
    i = 0;
    System.out.print("Arrayen: ");

    //while loopen skriver ut arrayen.
    while( i < 5) {

      System.out.print(heltall[i] + " ");
      i++;
    }
  }
}
