package chapter1;

import java.util.*;
import java.io.*;

public class RotateString {

	public static boolean rotateString(String s1, String s2) {

		if (s1.length() != s2.length()) { // to check if the string are equal or not
			return false;
		}

		if (s1.length() == s2.length() && s1.length() > 0) {

			String s1s1 = s1 + s1;
			return isSubstring(s1s1, s2);
		}

		return false;
	}

	private static boolean isSubstring(String str, String substr) {
		return str.contains(substr);
	}

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";

		System.out.println("String Rotation Outcome: " + rotateString(s1,s2));
		

	}

}
