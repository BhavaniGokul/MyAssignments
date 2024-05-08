package week3.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListFindMissingElement {

	public static void main(String[] args) {
		//array declaration
		int[] ary= {1, 2, 3, 4, 10, 6, 8}; 
		//adding into list
		List<Integer> arylist=new ArrayList<Integer>();
		for (int i : ary) {
			arylist.add(i);

		}
		//Arranging list
		Collections.sort(arylist);
		System.out.println(arylist);

			
		for (int i = 0; i < arylist.size() - 1; i++) {

			if ((arylist.get(i) + 1) != arylist.get(i + 1)) {
				System.out.println("The missing elements are: "+(arylist.get(i) + 1));
			}
		}
		
	}
}
