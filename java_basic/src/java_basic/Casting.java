package java_basic;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b =12;
		short s = 3;
		int i = 21;
		long l = 9l;
		float f = 2f;
		double d = 2;
		
		s = b;
		//b = (byte)s; #byte를 s(short)안에 넣어라. 강제캐스팅 시켜주는 것.
		b = (byte)i;
		System.out.println(s);
		System.out.println(b);
		System.out.println(b);
		System.out.println(b);
		
		System.out.println(s+i);
		System.out.println(s/i);
		
		System.out.println(s+f);
		System.out.println(s/f);
		
		System.out.println(1/2);
		System.out.println(1/2f);
		
		System.out.println("몫 : "+ s/i);
		System.out.println("나머지 : "+ s%i);
		
		
	}

}
