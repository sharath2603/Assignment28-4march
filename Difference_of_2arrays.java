package Assignment_march4;

public class Difference_of_2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,5,3,6,9};
		int b[]= {8,9,6,7,5};
		
		int c[]=new int[ a.length];
		
		for(int i=0;i<a.length;i++) {
			
			c[i]=a[i]-b[i];
			}
		for(int j=0;j<c.length;j++) {
			
			System.out.println("the difference:"+c[j]);
			
		}
	   }

     }
