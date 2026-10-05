public class Searching1 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11};

        int target = 7;

        int left = 0;
        int right = arr.length - 1;

        int answer = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {

                answer = mid;
                break;

            } else if (target > arr[mid]) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}