public class Return {

    public static void main(String[] args) {
        int i = 2;
        i = doThis(i);
        System.out.println(i);
    }

    public static int doThis(int i) {
        i = 3;
        return i;
    }
}
