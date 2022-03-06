package Assignment_march3;

import java.util.Scanner;

public class To_Print_all_even_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner (System.in);
			System.out.println("enter 10 numbers:");
			
			int a[]= new int [10];	
			for (int i=0;i<a.length;i++) 
				a[i]= sc.nextInt();	
			
				for (int i=0;i<a.length;i++)
			
			if (a[i]%2==0) 
						
		System.out.println("even number:"+a[i]);
						
			}
	}	
	

			
