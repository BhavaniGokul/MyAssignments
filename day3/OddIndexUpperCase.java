package week1.day3;

public class OddIndexUpperCase {

	public static void main(String[] args) {
		String st="changeme";
		char[] ch=st.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(i%2==0)
			{
				System.out.print(ch[i]);
			}
			else
			{
				char temp = Character.toUpperCase(ch[i]);
				System.out.print(temp);
			}
		}

	}

}
