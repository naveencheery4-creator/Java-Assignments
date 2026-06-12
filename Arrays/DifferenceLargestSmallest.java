public class DifferenceLargestSmallest {

    public static void main(String[] args) {

        int[] numbers = {10, 50, 20, 80, 30, 5};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        int difference = largest - smallest;

        System.out.println("Largest Value: " + largest);
        System.out.println("Smallest Value: " + smallest);
        System.out.println("Difference: " + difference);
    }
}

/* Output 
  Largest Value: 80
Smallest Value: 5
Difference: 75
  */
