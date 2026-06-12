public class RemoveDuplicatesNewArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 10, 50};

        int[] temp = new int[numbers.length];
        int uniqueCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {

                if (numbers[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        int[] newArray = new int[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            newArray[i] = temp[i];
        }

        System.out.print("New Array without Duplicates: ");

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

/* Output 
  New Array without Duplicates:
10 20 30 40 50
  */
