package JavaPracticePrograms7thOct;

import java.util.Scanner;

public class TableProgram {
	public static void main(String[] args) {
		
	
	int i;
	int j;
	System.out.println("Enter the table no to be printed");
	Scanner in=new Scanner(System.in);
	i=in.nextInt();
	for(j=1;j<=10;j++) {
		System.out.println(i+"*"+j+"="+(i*j));
	}
		
	

}}
