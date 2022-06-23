package Demo;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int swap=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number:");
		int numberOne=sc.nextInt();
		System.out.println("Enter Second Number");
		int numberTwo=sc.nextInt();
		System.out.println("before swaping number is " +numberOne+" " +numberTwo);
			swap=numberOne;
			numberOne=numberTwo;
			numberTwo=swap;
		System.out.println("After swaping the number is " +numberOne +" " + numberTwo);
			
			
		
		
		
	}

}
