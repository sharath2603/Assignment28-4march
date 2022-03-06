package Assignment_march1;

import java.util.Scanner;

public class Using_int_float_Long_Multipilicationvalue {
	public static int product(int a,int b) {
		int product = a*b;
		return product;
	}
	public static float product(float a,float b) {
		float product = a*b;
		return product;
	}
	public static long product(long a,long b) {
		long product = a*b;
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
			float n1= sc.nextFloat();
			float n2=sc.nextFloat();	
			float sum=product(n1,n2);
			System.out.println(sum);
			
			int a= sc.nextInt();
			int b=sc.nextInt();		
			int sum1=product(a,b);
			System.out.println(sum1);
			
			long a1= sc.nextLong();
			long b1=sc.nextLong();		
			long sum2=product(a1,b1);
			System.out.println(sum2);		
			
	}

}
