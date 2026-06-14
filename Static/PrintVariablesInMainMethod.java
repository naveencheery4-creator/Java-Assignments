public class PrintVariablesInMainMethod {

    // Static Variables
    static int staticVar1 = 100;
    static int staticVar2 = 200;

    // Instance Variables
    int instanceVar1 = 10;
    int instanceVar2 = 20;

    public static void main(String[] args) {

        // Create Object for Instance Variables
        PrintVariablesInMainMethod obj =
                new PrintVariablesInMainMethod();

        // Print Static Variables
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        // Print Instance Variables
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }
}

/* Output
  Static Variable 1: 100
Static Variable 2: 200
Instance Variable 1: 10
Instance Variable 2: 20
  */
