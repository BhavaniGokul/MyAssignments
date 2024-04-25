package week1.day3;

import java.util.Arrays;

public class FindDuplicatesArrays {

	public static void main(String[] args) {
		int[] value= {23,14,35,67,87,54,34,35,87,21};

		for (int i = 0; i < value.length; i++) { 
		for (int j = i+1; j < value.length; j++) { 
		if(value[i]==value[j]) {

		System.out.println("Duplicate Value is "+value[j]);
		}
		}
		}

		System.out.println("*************************************");

		Arrays.sort(value);
		for (int i = 0; i < value.length-1; i++) {
		if(value[i]==value[i+1]) {
		System.out.println(value[i+1]);
		}
		}
	}
}
