package Assignment_march2;

import java.util.Scanner;

public class Reverse_number_usingmethod {
	
public static void reverse(int n) {
	if (n <10) {
		System.out.println(n);
		return;
		}else {
			System.out.print( n%10);
	reverse(n/10);
		}
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		
		reverse(num);
		
		
		
		
		
		
	}

}
