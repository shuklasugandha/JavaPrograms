package JavaPracticePrograms7thOct;

import java.util.Scanner;

public class SumOfNnumbers {
	public static void main(String[] args) {
		
	
	int n;
	int temp=0;
	Scanner in =new Scanner(System.in);
	
System.out.println("Enter the value of n");
n=in.nextInt();
for(int i=0;i<=n;i++) {
	temp=temp+i;
	
}
System.out.println("the sum upto"+ n+" is:" +temp);
}
}