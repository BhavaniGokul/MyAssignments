package week1.day2;

public class Finonacci {

	public static void main(String[] args) {
		int range=8, num1=0, num2=1, num3;
		System.out.print(num1+" "+num2);
		for (int i = 0; i <(range-2); i++) {
			//
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
			}
	}
}
