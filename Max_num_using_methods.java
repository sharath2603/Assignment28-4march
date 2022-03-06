package Assignment_march1;

import java.util.Scanner;

public class Max_num_using_methods {
	public static int max(int a,int b) {
		int result = ((a>b)? a:b);
		return result;	
	}
	public static float max(float a,float b) {
		float result = ((a>b)? a:b);
		return result;	
	}
	public static double max(double a,double b) {
		double result = ((a>b)? a:b);
		return result;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("enter the numbers:");
		int a = sc.nextInt();
		int b =sc.nextInt();
		int result = ((a>b)? a:b);
		float result1=((a>b)? a:b);
		double result2 =((a>b)? a:b);
	
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}


	
}	
		
		
		
		
		
		
	