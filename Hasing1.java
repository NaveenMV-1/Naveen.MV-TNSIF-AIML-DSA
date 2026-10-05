import java.util.HashSet;

public class Hasing1 {

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        System.out.println(maxLength);
    }
}