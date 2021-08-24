package ds.practice.arrays;

import java.util.Scanner;

//Search for a number in a sorted list
public class BinarySearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {5,10,22,32,45,67,73,98,99,100};
		System.out.println("Enter the number to be searched");
		int n = sc.nextInt();
		int i = bSearch(arr,n);
		if(i != -99) {
			System.out.println("Element present at index: "+ (i+1));
		}
		else
			System.out.println("Element not present");
		sc.close();
	}

	private static int bSearch(int[] arr, int n) {
		int l=0,h=arr.length;
		int mid;
		while(l<=h) {
			mid=(l+h)/2;
			if(arr[mid] == n) {
				return mid;
			}
			else if(n<arr[mid]) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return -99;
		
	}

}
