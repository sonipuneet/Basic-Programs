package Leetcode;

import java.util.*;
import java.lang.*;

public class DegreeOfArray {
    // Find the degree of an array

    public int arrayDegree(int[] nums) {
        // Complexity O(n)
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // element x to check the occurence
            int x = nums[i];
            if (left.get(x) == null)
                left.put(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3, 4, 5};
        System.out.println("----------Degree of an Array----------- ");


        DegreeOfArray da = new DegreeOfArray();
        da.arrayDegree(nums);
        System.out.print("\n" + "Array values:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i] + " ");
        }

        //System.out.print("\n" + "Count Value:" +);

    }
}
