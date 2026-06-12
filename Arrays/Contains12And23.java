public class Contains12And23 {

    public static void main(String[] args) {

        int[] numbers = {10, 12, 20, 23, 30, 40};

        boolean has12 = false;
        boolean has23 = false;

        for (int number : numbers) {

            if (number == 12) {
                has12 = true;
            }

            if (number == 23) {
                has23 = true;
            }
        }

        if (has12 && has23) {
            System.out.println("Array contains both 12 and 23");
        } else {
            System.out.println("Array does not contain both 12 and 23");
        }
    }
}

/* Output
  Array contains both 12 and 23
  */
