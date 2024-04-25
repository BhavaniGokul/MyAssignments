package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		String toolname="Selenium";
		char[] ch1 = toolname.toCharArray();
		for (int i=ch1.length-1; i>=0; i--) {
			System.out.print(ch1[i])
			;
		}
	}

}
