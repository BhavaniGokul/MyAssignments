package week3.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestList {

	public static void main(String[] args) {
		// Declare an array {3, 2, 11, 4, 6, 7}. - 
		//Pick the 2nd element from the last and print it. 
		int[] ary={3, 2, 11, 4, 6, 7};
		List<Integer> arylist=new ArrayList<Integer>();
		for (int i : ary) {
			arylist.add(i);

		}
		Collections.sort(arylist);

		System.out.println(arylist);
		int b=arylist.size()-2;
		int SecondLargeNum=arylist.get(b);
		System.out.println("The second largest number is "+SecondLargeNum);
	}

}
