package chapter1;

public class RotateMatrix {

	// Rotate Matrix : Rotate the array by k steps

	public void rotateMatrix(int[] num, int k) {

		int temp, previous;

		for (int i = 0; i < k; i++) {
			previous = num[num.length - 1]; // To store the
			for (int j = 0; j < num.length; j++) {
				temp = num[j];
				num[j] = previous;
				previous = temp;
			}
		}
	}

	public static void main(String[] args) {

		int[] num = new int[] { 1, 2, 4, 5, 6, 7, 8 };
		int k = 2; // Number of times to rotate the steps
		
		System.out.print("The Initial Array : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print( " " + num[i] + " ");
		}
		
		RotateMatrix rm = new RotateMatrix();

		rm.rotateMatrix(num, k);
		System.out.print("\n");
		System.out.print("\nThe Rotated Array : ");
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.print( " " + num[i] + " ");
		}

	}

}
