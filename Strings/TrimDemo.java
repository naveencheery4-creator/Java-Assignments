public class TrimDemo {

    public static void main(String[] args) {

        String text = "   Java Programming   ";

        System.out.println("Before trim: '" + text + "'");
        System.out.println("Length Before: " + text.length());

        String trimmedText = text.trim();

        System.out.println("After trim: '" + trimmedText + "'");
        System.out.println("Length After: " + trimmedText.length());
    }
}

/* Output
  Before trim: '   Java Programming   '
Length Before: 22

After trim: 'Java Programming'
Length After: 16
  */
