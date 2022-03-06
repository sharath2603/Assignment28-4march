package Assignment_march3;

import java.util.Scanner;

public class Multiplying_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner (System.in);

 int a[]=new int [10];
 System.out.println("enter multiplying factor:");
 int d= sc.nextInt();
 System.out.println("enter 10 numbers:");
 for (int i=0;i<a.length;i++) {
	 a[i]=sc.nextInt();
	 
 }
 for (int i=0;i<a.length;i++) {
 System.out.println("the product is:"+d*a[i]);
 }		
	}
	
}
