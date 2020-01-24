/*
 * Author - Puneet Soni
 * */

package Leetcode;

import java.util.*;

public class SplitString {

    // Easy - Split a string

    public int balancedStringSplit(String s) {
        int count = 0;
        int max_amount_split = 0;
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {

            if (c[i] == 'R') {
                ++count;
            } else {
                if (c[i] == 'L')
                    --count;
            }

            if (count == 0) {
                max_amount_split++;
            }
        }

        return max_amount_split;
    }

    public static void main(String[] args) {

        String s = "RLRRLLRLRL";

    }
}
