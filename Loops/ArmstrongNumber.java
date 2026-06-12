public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 153;
        int originalNumber = number;
        int remainder;
        int sum = 0;

        while (number != 0) {

            remainder = number % 10;
            sum = sum + (remainder * remainder * remainder);
            number = number / 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }
    }
}

/* Output 
  153 is an Armstrong Number
  */
