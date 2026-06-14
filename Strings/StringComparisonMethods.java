public class StringComparisonMethods {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java Programming";

        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase: "
                + str1.equalsIgnoreCase(str2));

        // startsWith()
        System.out.println("startsWith(\"Java\"): "
                + str3.startsWith("Java"));

        // endsWith()
        System.out.println("endsWith(\"ming\"): "
                + str3.endsWith("ming"));

        // compareTo()
        System.out.println("compareTo: "
                + str1.compareTo(str2));
    }
}

/* Output
  equalsIgnoreCase: true
startsWith("Java"): true
endsWith("ming"): true
compareTo: -32
  */
