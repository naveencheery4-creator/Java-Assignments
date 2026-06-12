public class CountEvenOddNumbers {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30, 35, 40};

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of Even Elements: " + evenCount);
        System.out.println("Number of Odd Elements: " + oddCount);
    }
}

/* Output
  Number of Even Elements: 4
Number of Odd Elements: 3
  */
