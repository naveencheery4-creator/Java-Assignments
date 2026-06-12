public class IncrementDecrementDemo {

    public void incrementDecrement() {

        int number = 10;

        System.out.println("Original Value: " + number);

        number++;
        System.out.println("After Increment (++): " + number);

        number--;
        System.out.println("After Decrement (--): " + number);
    }

    public static void main(String[] args) {

        IncrementDecrementDemo obj = new IncrementDecrementDemo();
        obj.incrementDecrement();
    }
}
