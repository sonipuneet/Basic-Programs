import java.util.Scanner;
import java.io.*;

public class StringReverse {
/*	public static String reverse(String s) {
	     
	}
	
	public static void main(String[] args) {
		int length = reverse.length();
 
         for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + reverse.charAt(i);
    	
		System.out.println(reverse("puneet"));
	}
}*/

public static void main(String args[]) {
	 String a ,reverse = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string");
      a=in.nextLine();
 
      int length = a.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + a.charAt(i);
 
      System.out.println("Reverse is: "+reverse);
	  
   }
}