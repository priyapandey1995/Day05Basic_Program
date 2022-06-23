package Demo;

import java.util.Scanner;

public class CalculatePowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number");
		int n=sc.nextInt();
		while(n<=31) {
		for(int i=1;i<=n;i++)
		{
			System.out.println("2 X "+ i + "=" +2*i);
		}
		n++;
		
		}
		

	}

}
