public class CallStaticMethodInInstanceMethod {

    // Static Method
    public static void staticMethod() {
        System.out.println("Static Method Called");
    }

    // Instance Method
    public void instanceMethod() {

        // Calling Static Method
        staticMethod();
    }

    public static void main(String[] args) {

        CallStaticMethodInInstanceMethod obj =
                new CallStaticMethodInInstanceMethod();

        obj.instanceMethod();
    }
}

/* Output
  Static Method Called
  */
