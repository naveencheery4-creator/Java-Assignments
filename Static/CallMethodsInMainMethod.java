public class CallMethodsInMainMethod {

    // Static Method
    public static void staticMethod() {
        System.out.println("Static Method Called");
    }

    // Instance Method
    public void instanceMethod() {
        System.out.println("Instance Method Called");
    }

    public static void main(String[] args) {

        // Calling Static Method
        staticMethod();

        // Creating Object
        CallMethodsInMainMethod obj =
                new CallMethodsInMainMethod();

        // Calling Instance Method
        obj.instanceMethod();
    }
}

/* Output
  Static Method Called
Instance Method Called
  */
