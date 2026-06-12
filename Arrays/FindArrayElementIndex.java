public class FindArrayElementIndex {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int searchElement = 30;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchElement) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + searchElement +
                               " found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}

/* Output
  Element 30 found at index: 2
  */
