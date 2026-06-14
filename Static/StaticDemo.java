public class StaticDemo {

    // Static Variables
    static int staticVar1 = 100;
    static int staticVar2 = 200;

    // Instance Variables
    int instanceVar1 = 10;
    int instanceVar2 = 20;

    // Static Method 1
    public static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    // Static Method 2
    public static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    // Instance Method 1
    public void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    // Instance Method 2
    public void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {

        StaticDemo obj = new StaticDemo();

        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);

        staticMethod1();
        staticMethod2();

        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}

/*Output 
  Static Variable 1: 100
Static Variable 2: 200
Instance Variable 1: 10
Instance Variable 2: 20
Static Method 1
Static Method 2
Instance Method 1
Instance Method 2
  */
