public class StringCreationDemo {

    public static void main(String[] args) {

        // Method 1: String Literal
        String str1 = "Hello";

        // Method 2: Using new Keyword
        String str2 = new String("World");

        // Method 3: Character Array
        char[] chars = {'J', 'A', 'V', 'A'};
        String str3 = new String(chars);

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
    }
}

/* Output
  String 1: Hello
String 2: World
String 3: JAVA
  */
