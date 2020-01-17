// Author : Puneet Soni
// Program for searching an elements position in an unsorted array 


public class Unsorted_Search_Array {
	static int findElement(int arr[],int n, int element)
	{
		for (int i=0; i<n;i++)
			if (arr[i] == element)
				return i;
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {0,5,10,15,20};
			int n = arr.length;
			
			int element = 20;
			int position  = findElement(arr,n,element);
			
			if (position == -1)
				System.out.println("Element Not Found");
			else
				System.out.println("Element Found at position:" + (position+1));	
			}

}
