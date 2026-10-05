public class BitManu {

    public static void main(String[] args) {

        int num = 11;

        int count = 0;

        while (num > 0) {

            int remainder = num % 2;

            if (remainder == 1) {
                count++;
            }

            num = num / 2;
        }

        System.out.println(count);
    }
}