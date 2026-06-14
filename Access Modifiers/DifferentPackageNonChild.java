package package2;

import package1.ProtectedClass;

public class DifferentPackageNonChild {

    public static void main(String[] args) {

        ProtectedClass obj = new ProtectedClass();

        // System.out.println(obj.number); // Error

        // obj.display(); // Error
    }
}
