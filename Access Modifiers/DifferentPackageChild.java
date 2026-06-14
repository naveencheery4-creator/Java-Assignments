package package2;

import package1.ProtectedClass;

public class DifferentPackageChild extends ProtectedClass {

    public void test() {

        System.out.println(number);

        display();
    }
}
