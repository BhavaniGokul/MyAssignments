package week1.day3;

import java.util.Arrays;

public class SecondLargestArray {

	public static void main(String[] args) {
		
		
		int[] values = {3,2,11,4,6,7,10, 10};
		Arrays.sort(values);
		int length=values.length;
		System.out.println("The second largest number from array is: "+values[length-2]);
			
	}
}
