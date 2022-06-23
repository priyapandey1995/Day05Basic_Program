package Demo;

import java.util.Scanner;

public class ToFindQuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int remainder;
		int quotient;
		int result;
		System.out.print("Enter the Numerator");
		int a=sc.nextInt();
		System.out.print("Enter the  Denominator");
		int b=sc.nextInt();
		remainder=a%b;
		System.out.println("display remainder value" +" " + remainder );
		quotient=a/b;
		System.out.println("display quotient"  + " "+ quotient);
				
	}

}
