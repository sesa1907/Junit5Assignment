//import java.util.Scanner;

public class BubbleSort {
 
	public static int[] Sort(int arr[]) { 
		int n=arr.length, temp;
		
		for (int i = 0; i < n-1; i++) { 
			for (int j=0; j<n-i-1; j++) { 
				if (arr[j+1] < arr[j]) {
					temp	= arr[j+1];
					arr[j+1]= arr[j];
					arr[j]	= temp;
				}
			} 
		} 
		
		return arr;
	}
 
}
