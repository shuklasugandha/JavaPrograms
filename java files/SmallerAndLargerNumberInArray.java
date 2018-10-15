package JavaPracticePrograms7thOct;

public class SmallerAndLargerNumberInArray {
	public static void main(String[] args) {
		
		int numArray[]=new int[] {23,45,49,78};
		
		int smallNo=numArray[0];
		int LargeNo=numArray[0];
		
		for(int i=1;i<numArray.length;i++) {
			if(numArray[i]>LargeNo)
				LargeNo=numArray[i];
			else if(numArray[i]<smallNo)
				smallNo=numArray[i];
				}
		System.out.println("Largest NUmber is:"+LargeNo);
		System.out.println("Smallest NUmber is:"+smallNo);
	}
}
