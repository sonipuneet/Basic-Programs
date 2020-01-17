package chapter2;

public class CompareString {

	public static void main(String[] args) {
		String s1 = "2.0.1";
		String s2 = "2.0";

		System.out.println("Equal or not :" + s1.compareTo(s2));
		
		System.out.println("Equal or not :" + s2.compareTo(s1));
		
	}

}
