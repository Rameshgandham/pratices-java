package room1;

import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
//		int a=35;
//		int b=75;
//		int c=85;
		Scanner sc =new Scanner(System.in);
		System.err.println("Enter the value:");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		
		if (i>35) {
			System.out.println("35 below marks student are fail");
			
		}
		else if (j<75) {
			System.out.println("75 above student are second class");
			
		}
		if (j>k) {
			System.out.println("85 above student are first class ");
			
		}
		else {
			System.out.println("this is exam pattern");
		}
		
			
		}

	}


