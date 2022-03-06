package Assignment_march4;

public class Last_index_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,5,6,8};
		int d = 2;
		
		for (int i=0;i<a.length;i++) {
			int index=-1;
			
			if (a[i]==d) {
			
				System.out.println("print the first index number:"+index);
			index=i;
			}else
				System.out.println("not found");
		
		}
	}

}
