package Assignment_march1;

import java.util.Scanner;

public class Add_2_numbers_and_return_answer {

	
	public static int add(int a,int b) {
		int sum=a+b;
		return sum;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
	 int n1= sc.nextInt();
	 int n2=sc.nextInt();
		
	 int sum=add(n1,n2);
	 System.out.println(sum);
	 
	}

}
