/*
 * Author - Puneet Soni
 * */
// LeetCode Easy 709 - Convert a given string to lower case.


// ASCII Range: Upper case - 65 to 90 & Lower Case - 97 to 122
package Leetcode;

public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                sb.append((char) (c + 'a' - 'A'));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "Hello";

    }
}
