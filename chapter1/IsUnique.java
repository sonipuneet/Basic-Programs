package chapter1;

import java.util.*;
import java.util.Map.Entry;

public class IsUnique {
	int test(String s)
	{
		HashMap<Character, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!map.containsKey(ch)) {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(ch, list);
			} else {
				List<Integer> list = map.get(ch);
				list.add(i);
			}
		}
		System.out.println(map);
		int result = Integer.MAX_VALUE;
		for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
			List<Integer> value = entry.getValue();
			if (value.size() != 1) {
				continue;
			}
			if (value.get(0) < result) {
				result = value.get(0);
			}
		}
		return result;
	}
	boolean isUnique(String s) {

		HashSet<Character> hs = new HashSet<>(); // Created a hashset to input the characters

		char[] chars = s.toCharArray(); // to get the string characters in chars

		for (Character c : chars) {
			// print to debug
			if (!hs.add(c)) { // Check the condition for unique characters
				return false;
			}
		}
		return true;
	}

	boolean isUnique2(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				char ch = s.charAt(i);
				if (ch != s.charAt(j)) {
					continue;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		IsUnique iu = new IsUnique();

		// Table driven tests
		Map<String, Boolean> testCases = Map.of("", true, "A", true, "AB", true, "AA", false);

		Set<Entry<String, Boolean>> entrySet = testCases.entrySet();
		Iterator<Entry<String, Boolean>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, Boolean> next = iterator.next();
			if (next.getValue() == iu.isUnique(next.getKey())) {
				System.out.println("Test passed: " + next.getKey() + " " + next.getValue());
			} else {
				System.out.println("Test failed: " + next.getKey() + " " + next.getValue());
			}
		}
		
		System.out.println(iu.test("loveleetcode"));
	}
}
