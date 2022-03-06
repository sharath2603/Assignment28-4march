package Assignment_march1;

import java.util.Scanner;

public class Calculator_program {
public static int add(int a,int b) {
	int add = a+b;
	return add;
}
public static int diff(int a,int b) {
	int diff = a-b;
	return diff;
}
public static int pro(int a,int b) {
	int pro = a*b;
	return pro;
}
public static double quo(double a,double b) {
	double quo = a/b;
	return quo;
}
public static double avg(double a,double b) {
	double avg = (a+b)/2;
	return avg;
}
public static double modulo(double a,double b) {
	double modulo = a%b;
	return modulo;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter 2 numbers:");
		int a =sc.nextInt();
		int b= sc.nextInt();
	
			
		int res = add(a,b);
		int res1= diff(a,b);
		int res2= pro(a,b);
		double res3= quo(a,b);
		double res4= avg(a,b);
		double res5= modulo(a,b);
		
		System.out.println("addition :" +res);
		System.out.println("subtraction :" +res1);
		System.out.println("multipilication :" +res2);
		System.out.println("division :" +res3);
		System.out.println("average :" +res4);
		System.out.println("modulo :" +res5);
	
	}

}
