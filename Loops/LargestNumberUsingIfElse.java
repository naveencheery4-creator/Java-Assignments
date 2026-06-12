public class LargestNumberUsingIfElse {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b && a > c) {
            System.out.println(a + " is the Largest Number");
        }
        else if (b > a && b > c) {
            System.out.println(b + " is the Largest Number");
        }
        else {
            System.out.println(c + " is the Largest Number");
        }
    }
}
