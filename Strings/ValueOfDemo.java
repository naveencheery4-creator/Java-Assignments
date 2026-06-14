public class ValueOfDemo {

    public static void main(String[] args) {

        int number = 100;
        double salary = 25000.50;

        String strNumber = String.valueOf(number);
        String strSalary = String.valueOf(salary);

        System.out.println("Integer String: " + strNumber);
        System.out.println("Double String: " + strSalary);

        System.out.println("Type of strNumber: " +
                ((Object) strNumber).getClass().getSimpleName());

        System.out.println("Type of strSalary: " +
                ((Object) strSalary).getClass().getSimpleName());
    }
}

/* Output
  Integer String: 100
Double String: 25000.5
Type of strNumber: String
Type of strSalary: String
  */
