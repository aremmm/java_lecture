package java_basic;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=0;
		int c=0;
		
		boolean result;
		
		a=1;b=2;c=3;
		result= a<b && c>2;
//		result = ((a=1) < (b=2)) && ((c=3) > 2);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		
		result = a>b || c>2;
//		result = ((a=1) > (b=2)) || ((c=3) > 2);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		
		
	}

}
