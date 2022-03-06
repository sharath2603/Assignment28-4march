package Assignment_march3;

import java.util.Scanner;

public class Using_Array_to_find_sumofallelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner (System.in);
	System.out.println("enter 10 numbers:");
			int a[]= new int [10];	
			int sum=0;
			
			for (int i=0;i<a.length;i++) {
				a[i]= sc.nextInt();
				sum =sum+a[i];		
				
			}
			System.out.println("sum of all elements:"+sum);
			
			
			
		}
	
	}
