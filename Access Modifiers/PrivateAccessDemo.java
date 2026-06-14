public class PrivateAccessDemo {

    private int number = 100;

    private void display() {
        System.out.println("Private Method Called");
    }

    public static void main(String[] args) {

        PrivateAccessDemo obj = new PrivateAccessDemo();

        System.out.println("Private Variable: " + obj.number);

        obj.display();
    }
}

/* Output
  Private Variable: 100
Private Method Called
  */
