public class PrintInstanceVariablesInStaticMethod {

    int instanceVar1 = 100;
    int instanceVar2 = 200;

    public static void staticMethod() {

        PrintInstanceVariablesInStaticMethod obj =
                new PrintInstanceVariablesInStaticMethod();

        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }

    public static void main(String[] args) {

        staticMethod();
    }
}

/* Output 
  Instance Variable 1: 100
Instance Variable 2: 200
  */
