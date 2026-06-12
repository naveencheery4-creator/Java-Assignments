public class InsertElementInArray {

    public static void main(String[] args) {

        int[] originalArray = {10, 20, 30, 40, 50};

        int element = 25;
        int position = 2; // Insert at index 2

        int[] newArray = new int[originalArray.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++) {

            if (i == position) {
                newArray[i] = element;
            } else {
                newArray[i] = originalArray[j];
                j++;
            }
        }

        System.out.print("Array after insertion: ");

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

/* Output
  Array after insertion:
10 20 25 30 40 50
  */
