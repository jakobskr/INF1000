import java.util.Scanner;//importerer scanneren
class MinOppgave1 {
  public static void main(String [] args){
    String[] question = {"Norway", "Sweden", "Estland", "Peru"};
    String[] answer = {"oslo", "stockholm", "tallin", "lima"};
    Scanner scan = new Scanner(System.in);
    int poeng = 0;
    for (int i = 0; i < question.length; i++) {
	    System.out.println("What is the capital in " + question[i] + "?");
      if((scan.next()).equalsIgnoreCase(answer[i])){
        poeng ++;
      }
      System.out.println("");
  }
  System.out.println("Du fikk " + poeng + " poeng!");
  }
}
