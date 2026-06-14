 public class CallInstanceMethodInStaticMethod {

    // Instance Method
    public void display() {
        System.out.println("Instance Method Called");
    }

    // Static Method
    public static void staticMethod() {

        // Create Object
        CallInstanceMethodInStaticMethod obj =
                new CallInstanceMethodInStaticMethod();

        // Call Instance Method
        obj.display();
    }

    public static void main(String[] args) {

        staticMethod();
    }
}

/* Output
  Instance Method Called
  */
