public class InheritanceDemo {

    public static void main(String[] args) {

        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("----- Class A -----");
        objA.methodA1();
        objA.methodA2();
        objA.display();

        System.out.println("\n----- Class B -----");
        objB.methodA1();
        objB.methodA2();
        objB.methodB1();
        objB.methodB2();
        objB.display();

        System.out.println("\n----- Class C -----");
        objC.methodA1();
        objC.methodA2();
        objC.methodB1();
        objC.methodB2();
        objC.methodC1();
        objC.methodC2();
        objC.display();
    }
}

/* Output
  ----- Class A -----
Method A1
Method A2
Display Method in Class A

----- Class B -----
Method A1
Method A2
Method B1
Method B2
Display Method in Class B

----- Class C -----
Method A1
Method A2
Method B1
Method B2
Method C1
Method C2
Display Method in Class C
  */
