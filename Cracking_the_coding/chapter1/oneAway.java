package chapter1;

public class oneAway {

	/*
	 * Three Operation can be performed on a string insertion, deletion and removal
	 * a character.
	 * 
	 */

	// Time Complexity O(n^2)

	/*
	 * Approach 1. Use dynamic programming to solve this question 
	 * Approach 2. Keeping the count of string (Time Complexity is O(n))
	 */

	public static boolean oneEditAway(String s1, String s2) {
		
		// Base case to check more than 1 edits in given strings
		if (s1.length() - s2.length() > 1) {
			return false;
		}

		int count = 0; // To count the number of edits

		int i = 0;
		int j = 0;

		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) != s2.charAt(j)) {
				if (count == 1) {
					return false;
				}

				if (s1.length() > s2.length()) { // If s1 is greater
					i++;
				} else if (s1.length() < s2.length()) { // If s2 is greater
					j++;
				}

				else // Length of both the strings are same.
				{
					i++;
					j++;
				}
				count++; // to count the edits

			} else { // Check the remaining string
				i++;
				j++;
			}
		}

		if (i < s1.length() || j < s2.length()) {
			count++;
		}
		return count == 1;
	}

	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "abce";
		System.out.println("\nThe Initial String is : \n" + s1 + " " + s2);

		if (oneEditAway(s1, s2)) {
			System.out.println("\nTrue");
		} else {
			System.out.println("\nFalse");
		}

	}

}
