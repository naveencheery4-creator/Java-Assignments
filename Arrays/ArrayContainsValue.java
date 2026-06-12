public class ArrayContainsValue {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int searchValue = 40;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchValue + " is present in the array");
        } else {
            System.out.println(searchValue + " is not present in the array");
        }
    }
}

/* Output
  40 is present in the array
  */
