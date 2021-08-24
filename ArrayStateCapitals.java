package ds.practice.arrays;

import java.util.Scanner;

public class ArrayStateCapitals {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int f =0;
		String[] state 	= {"Andhra Pradesh","Bihar","Haryana","Jharkhand","Karnataka","Maharashtra","Rajasthan","Tamil Nadu","Uttar Pradesh","West Bengal"};
		String[] capital 	= {"Amravati","Patna","Chandigarh","Ranchi","Bengaluru","Mumbai","Jaipur","Chennai","Lucknow","Kolkata"};
		System.out.println("Enter the name of the state");
		String s = sc.nextLine();
		for(int i =0; i<state.length; i++) {
			if(state[i].equalsIgnoreCase(s)) {
				f=1;
				System.out.println("The capital of " + s + " is " + capital[i]);
			}
		}
		if(f==0) {
			System.out.println("No State Found");
		}
		
	}


}
