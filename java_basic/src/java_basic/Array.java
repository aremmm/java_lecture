package java_basic;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11/23(¸ñ)
		
		int [] a = new int[10];
		
		System.out.println(a[4]);
		
		a[4]=100;
		System.out.println(a[4]);
		
		for(int i=0; i<a.length; i++) {
			a[i]=i+1;
			
		}
		System.out.println(a[8]);
	}

}
