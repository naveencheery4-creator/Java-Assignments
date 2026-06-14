public class PrintStaticVariablesInInstanceMethod {

    static int staticVar1 = 100;
    static int staticVar2 = 200;

    public void instanceMethod() {

        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }

    public static void main(String[] args) {

        PrintStaticVariablesInInstanceMethod obj =
                new PrintStaticVariablesInInstanceMethod();

        obj.instanceMethod();
    }
}

/* Output
  Static Variable 1: 100
Static Variable 2: 200
  */
