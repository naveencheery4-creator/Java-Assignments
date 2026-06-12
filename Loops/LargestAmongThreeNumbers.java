public class LargestAmongThreeNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        int c = 15;

        if (a >= b && a >= c) {
            System.out.println("Largest Number: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest Number: " + b);
        } else {
            System.out.println("Largest Number: " + c);
        }
    }
}

/* Output
  Largest Number: 25
  */
