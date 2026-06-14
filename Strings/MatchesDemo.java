public class MatchesDemo {

    public static void main(String[] args) {

        String text1 = "Java123";
        String text2 = "Java";

        boolean result1 = text1.matches("[a-zA-Z0-9]+");
        boolean result2 = text2.matches("[0-9]+");

        System.out.println("Java123 contains only letters and numbers: " + result1);
        System.out.println("Java contains only numbers: " + result2);
    }
}

/* Output
  Java123 contains only letters and numbers: true
Java contains only numbers: false
  */
