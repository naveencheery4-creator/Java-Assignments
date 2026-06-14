public class SubstringDemo {

    public static void main(String[] args) {

        String text = "Java Programming";

        String sub1 = text.substring(5);
        String sub2 = text.substring(0, 4);

        System.out.println("Original String: " + text);
        System.out.println("Substring from index 5: " + sub1);
        System.out.println("Substring from index 0 to 4: " + sub2);
    }
}

/* Output
  Original String: Java Programming
Substring from index 5: Programming
Substring from index 0 to 4: Java
  */
