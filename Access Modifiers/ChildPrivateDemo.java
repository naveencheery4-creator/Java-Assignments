public class ChildPrivateDemo extends PrivateAccessDemo {

    public void test() {

        // System.out.println(number); // Error

        // display(); // Error

        System.out.println("Cannot access private members");
    }

    public static void main(String[] args) {

        ChildPrivateDemo obj = new ChildPrivateDemo();

        obj.test();
    }
}

/* Output
  Cannot access private members
  */
