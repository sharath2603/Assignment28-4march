package Assignment_march2;

import java.util.Scanner;

public class fibonacci_series {
	public static void Fibo(int n) {
		int count=0;
		int a=0,b=1;
		while (count<=n) {
			int sum=a+b;
			a=b;
			b=sum;
		
		count++;
	         
			System.out.println(a);	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
	
		Fibo(n);
		
	
		
	}

}
