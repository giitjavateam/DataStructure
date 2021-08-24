package ds.practice.arrays;
//Print sum of elements of both diagonals
import java.util.Scanner;

public class DiagonalsSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns for NxN matrix)");
		int r = sc.nextInt();
		int i,j;
		int arr[][]= new int[r][r];
		System.out.println("Enter array elements");
		for(i=0;i<r;i++) {
			for(j=0;j<r;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		printSum(arr,r);
	}

	private static void printSum(int[][] arr, int r) {
		int sum =0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				if(i==j || (i+j == (r-1))) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println("Sum : " + sum);
	}

}
