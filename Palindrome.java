public class Palindrome {

    public static void main(String[] args) {

        String str = "madam";

        boolean palindrome = true;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {

                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(palindrome);
    }
}