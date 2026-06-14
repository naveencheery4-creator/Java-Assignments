public class RuntimePolymorphismDemo {

    public static void main(String[] args) {

        // Superclass reference to B object
        A obj1 = new B();
        obj1.display();

        // Superclass reference to C object
        A obj2 = new C();
        obj2.display();
    }
}

/* Output
  Display Method in Class B
Display Method in Class C
  */
