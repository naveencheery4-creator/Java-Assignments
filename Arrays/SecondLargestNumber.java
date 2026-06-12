public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 50, 30, 80, 40};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } 
            else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Second Largest Number: " + secondLargest);
    }
}

/* Output
  Largest Number: 80
Second Largest Number: 50
  */
