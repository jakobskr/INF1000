public class Array {
public static void main(String [] args){
int [] tall = {2,3,6,9};
int i = 0;
int sum = 0;
while (i <= tall.length) {
    sum = sum + tall[i];
    i++;
}
System.out.println(sum);
}
}
