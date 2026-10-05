public class Hasing3 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3};

        int k = 2;

        int[] numbers = new int[arr.length];
        int[] frequency = new int[arr.length];

        int uniqueCount = 0;

        
        for (int i = 0; i < arr.length; i++) {

            boolean found = false;

            for (int j = 0; j < uniqueCount; j++) {

                if (numbers[j] == arr[i]) {

                    frequency[j]++;
                    found = true;
                    break;
                }
            }

            if (!found) {

                numbers[uniqueCount] = arr[i];
                frequency[uniqueCount] = 1;

                uniqueCount++;
            }
        }


        for (int i = 0; i < uniqueCount; i++) {

            for (int j = i + 1; j < uniqueCount; j++) {

                if (frequency[j] > frequency[i]) {

                    int temp = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = temp;

                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }


        for (int i = 0; i < k; i++) {

            System.out.print(numbers[i] + " ");
        }
    }
}