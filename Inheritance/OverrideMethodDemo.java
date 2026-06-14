public class OverrideMethodDemo {

    public static void main(String[] args) {

        B objB = new B();
        C objC = new C();

        objB.display();
        objC.display();
    }
}

/* Output
  Display Method in Class B
Display Method in Class C
  */
