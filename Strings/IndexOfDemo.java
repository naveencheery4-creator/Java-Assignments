public class IndexOfDemo {

    public static void main(String[] args) {

        String text = "Java Programming";

        int index1 = text.indexOf("Programming");
        int index2 = text.indexOf("a");
        int index3 = text.indexOf("z");

        System.out.println("Index of Programming: " + index1);
        System.out.println("Index of a: " + index2);
        System.out.println("Index of z: " + index3);
    }
}

/* Output
  Index of Programming: 5
Index of a: 1
Index of z: -1
  */
