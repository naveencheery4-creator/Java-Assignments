public class PublicAccessDemo {

    public static void main(String[] args) {

        PublicClass obj = new PublicClass();

        System.out.println("Number: " + obj.number);

        obj.display();
    }
}

/* Output
  Number: 100
Public Method Called
  */
