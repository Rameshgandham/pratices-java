package room1;

import java.util.Iterator;

public class Primenumber {

	public static void main(String[] args) {
		
		for(int i=2; i<=20; i++) {
			int count=0;
			for(int j=1; j<=i;j++) {
				if (i%j==0) {
					count=count+1;
				}
					
				}
			if (count==2) 
			{
				System.out.println(i+"is the prime number");
				
			}
			}
		}

		
	}

			
		
		

	

	