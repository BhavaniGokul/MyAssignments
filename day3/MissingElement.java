package week1.day3;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int a[]={1, 4,3,2,8, 6, 7};
		Arrays.sort(a);
		int temp = 0;
		for (int i = 0; i < a.length-1; i++) {
			
			if((i+1)!=a[i])
			{
			temp=i+1;
			System.out.println("The missing element is: "+temp);
			break;
			}
			}
		
	}

}
