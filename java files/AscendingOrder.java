package JavaPracticePrograms7thOct;

import java.util.Scanner;

public class AscendingOrder {
	public static void main(String[] args) {
		
	int n,temp;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter No of Elements you want:");
	n=s.nextInt();
	
	int a[]=new int[n];
	System.out.println("Enter the elements:");
	
	for(int i=0;i<1;i++) {
	a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}

}
}