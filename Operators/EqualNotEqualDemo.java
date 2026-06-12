public class EqualNotEqualDemo {

    public void checkEquality(int a, int b) {

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Equal (==): " + (a == b));
        System.out.println("Not Equal (!=): " + (a != b));
    }

    public static void main(String[] args) {

        EqualNotEqualDemo obj = new EqualNotEqualDemo();

        obj.checkEquality(10, 10);
    }
}
