package JavaPracticePrograms7thOct;

import java.util.Scanner;

//a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
//The simplest is the series 1, 1, 2, 3, 5, 8, etc.
public class FibonacciSeries {
	public static void main(String[] args) {
		int num;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		int f1,f2=0,f3=1;
		
		for(int i=1;i<=num;i++) {
			
			System.out.println(f3+"");
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
		
		
	}

}
