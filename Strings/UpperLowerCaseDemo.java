public class UpperLowerCaseDemo {

    public static void main(String[] args) {

        String text = "Java Programming";

        String upperCase = text.toUpperCase();
        String lowerCase = text.toLowerCase();

        System.out.println("Original String: " + text);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
    }
}

/* Output
  Original String: Java Programming
Uppercase: JAVA PROGRAMMING
Lowercase: java programming
  */
