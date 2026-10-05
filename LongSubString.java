public class LongSubString {

    public static void main(String[] args) {

        String str = "abcabcbb";

        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {

            int length = 0;

            for (int j = i; j < str.length(); j++) {

                boolean duplicate = false;
                for (int k = i; k < j; k++) {

                    if (str.charAt(j) == str.charAt(k)) {
                        duplicate = true;
                        break;
                    }
                }

                if (duplicate) {
                    break;
                }

                length++;

                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        System.out.println(maxLength);
    }
}