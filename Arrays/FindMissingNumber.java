public class FindMissingNumber {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 10};

        int missingNumber = -1;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i + 1] != numbers[i] + 1) {
                missingNumber = numbers[i] + 1;
                break;
            }
        }

        System.out.println("Missing Number: " + missingNumber);
    }
}

/* Output
  Missing Number: 9
  */
