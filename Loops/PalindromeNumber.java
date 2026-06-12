public class PalindromeNumber {

    public static void main(String[] args) {

        int number = 121;
        int originalNumber = number;
        int reverse = 0;
        int remainder;

        while (number != 0) {

            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a Palindrome Number");
        } else {
            System.out.println(originalNumber + " is not a Palindrome Number");
        }
    }
}

/* Output
  121 is a Palindrome Number
  */
