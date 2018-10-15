package JavaPracticePrograms7thOct;

import java.util.Scanner;

public class MaximumOfThreeNumbers {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter value of a:");
		a=in.nextInt();
		
		System.out.println("Enter value of b:");
		b=in.nextInt();
		
		System.out.println("Enter value of c:");
		c=in.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is big number");
		}
		else if(b>a && b>c) {
			System.out.println("b is big number");
		}
		else
			System.out.println("c is big number");
	}

}
