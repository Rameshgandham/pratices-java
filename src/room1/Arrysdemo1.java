package room1;

public class Arrysdemo1 {

	public static void main(String[] args) {
		int num = 333;
		int rev =0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		System.out.println(num);
		if (temp==rev) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("given number is not a palindrome");
		}
		
		

	}

}

