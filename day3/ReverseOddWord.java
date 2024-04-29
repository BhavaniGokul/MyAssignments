package week1.day3;

public class ReverseOddWord {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split=test.split(" ");
		//char reverse = ;

		for(int i=0;i<test.length();i++)
		{
			if (i%2!=0)
			{
				String reverse=" ";
				char[] ch1 = split[i].toCharArray();
				for (int j=ch1.length-1; j>=0; j--)
				{
					reverse = reverse+ch1[j];
				}	
				System.out.print(reverse+" ");
			}
			else
			{System.out.print(split[i]+" ");}

		}
	}
}