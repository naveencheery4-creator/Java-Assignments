public class ReplaceDemo {

    public static void main(String[] args) {

        String text = "Java Programming";

        String newText = text.replace('a', 'o');

        System.out.println("Original String: " + text);
        System.out.println("After Replace: " + newText);
    }
}

/* Output
  Original String: Java Programming
After Replace: Jovo Progrimming
  */
