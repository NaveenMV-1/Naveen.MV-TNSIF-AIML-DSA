public class Hasing2 {

    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        boolean[] used = new boolean[t.length()];

        for (int i = 0; i < s.length(); i++) {

            boolean found = false;

            for (int j = 0; j < t.length(); j++) {

                if (s.charAt(i) == t.charAt(j) && !used[j]) {

                    used[j] = true;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}