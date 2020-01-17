package chapter1;

import java.util.Arrays;

public class StringPermutation {

	static boolean checkPermutation(String s1, String s2) {
		// the input strings should be of same length

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s1.toCharArray();

		// Sort the strings using the sort function

		Arrays.sort(ch1);
		Arrays.sort(ch2); // what if the string is not sorted

		// compare the sorted strings

		for (int i = 0; i < s1.length(); i++) {
			if (ch1[i] != ch2[i])
				return false;
		}

		return true;
	}

	public static void main(String[] args) {

		String s1 = "god";
		String s2 = "dog";

		if (checkPermutation(s1, s2)) {
			System.out.println("Yes. String is a permutation.");
		} else {
			System.out.println("No. String is not a permutation.");
		}

	}

}
