package ds.practice.arrays;

// Program to take input in arrays and print sum of positive integers and negative integers separately

public class ArrayPrintSum {
	public static void main(String args[]) {
		int arr[] = {45,-23,54,-39,-1,25,42,-17,50};
		int nsum=0, psum=0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] > 0) {
				psum+= arr[i];
			}
			else {
				nsum+= arr[i];
			}
		}
		System.out.println("Sum of positive integers : " + psum +"\n Sum of negative integers : " + nsum);
	}

}
