public class VariableScopeDemo {

    // Global (Instance) Variable
    int number = 100;

    public void display() {

        // Local Variable
        int number = 200;

        System.out.println("Local Variable: " + number);
        System.out.println("Global Variable: " + this.number);  //this is Refers to the current class's instance variable
    }

    public static void main(String[] args) {

        VariableScopeDemo obj = new VariableScopeDemo();
        obj.display();
    }
}
