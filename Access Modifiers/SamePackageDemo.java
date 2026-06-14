public class SamePackageDemo {

    public static void main(String[] args) {

        ProtectedClass obj = new ProtectedClass();

        System.out.println("Number: " + obj.number);

        obj.display();
    }
}

/* Output
  Number: 100
Protected Method Called
  */
