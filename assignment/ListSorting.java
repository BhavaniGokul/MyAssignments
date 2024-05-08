package week3.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		//Declaring string array and adding into list
		String[] ary= {"HCL, Wipro, Aspire Systems, CTS"};
		List<String> strList=new ArrayList<String>();
		for (String i : ary) {
			strList.add(i);
		}
		//sorting list
		Collections.sort(strList);
		System.out.println(strList);
		
		for (int i=0;i<strList.size();i++) {
			String des=strList.get(i);
			System.out.println(des);
		}
	}
}
