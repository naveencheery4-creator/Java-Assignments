public class SplitDemo {

    public static void main(String[] args) {

        String text = "Java,Python,C++,JavaScript";

        String[] languages = text.split(",");

        System.out.println("Languages:");

        for (String language : languages) {
            System.out.println(language);
        }
    }
}

/* Output
  Languages:
Java
Python
C++
JavaScript
  */
