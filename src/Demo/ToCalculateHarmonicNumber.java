package Demo;

import java.util.Scanner;

public class ToCalculateHarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		double nthHarmonic=0;
		if(number!=0){
			for(int i=1;i<=number;i++) {
				System.out.print("1/" + i + " "  );
			    nthHarmonic+=1/(double)i;
			}
		
		}
		else {
			System.out.println("limit should be more than 0");
		}
		System.out.println("=" + nthHarmonic);
		

}
}
