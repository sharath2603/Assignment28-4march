package Assignment_march2;

import java.util.Scanner;

public class Swaping_Numbers {
	public static void Swap(int n1, int n2) {
	int x=10;
	int y=5;
	x = x + y;
     y = x - y;
     x = x - y;
     System.out.println("After swapping:"
                        + " x = " + x + ", y = " + y);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Swap(a,b);
		
       
	}
	

}
