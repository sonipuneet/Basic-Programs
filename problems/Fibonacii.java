
public class Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0; // First number of the series
		int n2 = 1; // Second number of the series
		int n3; // The result of the 2 numbers
		int i; // For iteration
		int count =10; // Max count for the numbers to be printed in the series
		
		System.out.println("The Fibonacii series is as follows:");
		System.out.println(n1+ "  " +n2);
		
		// Withour Recursion
		for(i=2;i<count;i++)
		{
			n3 = n1 + n2;
			System.out.println("" +n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
