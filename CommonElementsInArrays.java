public class CommonElementsInArrays {

    public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {30, 40, 60, 70, 80};

        System.out.println("Common Elements:");

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}

/* Output 
  Common Elements:
30
40
  */
