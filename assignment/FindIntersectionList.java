package week3.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {

		int[] array1={3, 2, 11, 4, 6, 7};
		int[] array2={1, 2, 8, 4, 9, 7};

		//convert array into list
		List<Integer> val1=new ArrayList<Integer>();
		for (Integer i : array1) {
			val1.add(i);
		}
		Collections.sort(val1);
		System.out.println(val1);

		List<Integer> val2=new ArrayList<Integer>();
		for (Integer j : array2) {
			val2.add(j);
		}
		Collections.sort(val2);
		System.out.println(val2);

		for (int a = 0; a < array1.length; a++) {

			for (int b = 0; b < array2.length; b++) {


				if(val1.get(a)==val2.get(b))
				{
					System.out.println("The arrays intersect at: "+val2.get(b));
				}
			}
		}
	}
}
