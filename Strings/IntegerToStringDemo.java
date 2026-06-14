public class IntegerToStringDemo {

    public static void main(String[] args) {

        Integer number = 500;

        String str = number.toString();

        System.out.println("Integer Object: " + number);
        System.out.println("Converted String: " + str);

        System.out.println("Type: " +
                ((Object) str).getClass().getSimpleName());
    }
}

/* Output
  Integer Object: 500
Converted String: 500
Type: String
  */
