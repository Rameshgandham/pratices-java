package room1;

import java.util.Scanner;

public class Arraysdemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		boolean a[]=new boolean [size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextBoolean();
			
		}
		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
			
		}
	

	}

}
