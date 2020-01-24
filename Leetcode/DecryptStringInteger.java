package Leetcode;

public class DecryptStringInteger {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int current = i; // current position
            int endIndex = current + 1; // Second pointer to check the position for 2 digit numbers
            if (current < s.length() - 2 && s.charAt(current + 2) == '#') {
                endIndex = current + 2;
                i += 2;
            }
            int num = Integer.parseInt(s.substring(current, endIndex));
            char c = (char) (num + 96);
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "123423#";
    }
}
