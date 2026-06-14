public class EqualsDemo {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Python";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str3: " + str1.equals(str3));
    }
}

/* Output
  str1 equals str2: true
str1 equals str3: false
  */
