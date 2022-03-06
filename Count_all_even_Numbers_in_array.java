package Assignment_march3;

public class Count_all_even_Numbers_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,5,2,5,8,24,62,32};
int count=0;
for (int i=0;i<a.length;i++) {
	
	if (a[i]%2==0) {
		
		
		System.out.println(a[i]);
		count++;
}
}
	}
	
}
