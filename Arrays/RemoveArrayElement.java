public class RemoveArrayElement {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int removeElement = 30;

        System.out.print("Array after removing " + removeElement + ": ");

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != removeElement) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

/* Output
  Array after removing 30:
10 20 40 50
  */
