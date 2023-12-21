package java_basic;

public class for_2 {

	public static void main(String[] args) {
	
//		int sum =0;
//		
//		for (int i=1; i<10; i++) {
//			
//		}
//			sum =sum*i;
//			
//		System.out.println("");
		
		int dan =2; //2단
		String result="";
		
		for (int gop=1;gop<10;gop++) { //gop(곱)은 1씩 증가하고, 10 이하까지 반복.
//			System.out.println(dan*gop);
			result = result+(dan+"*"+gop+"="+(dan*gop)+"\n"); // 단*곱=(단*곱)
			
		System.out.println(result);
		
		}
		
		
	}

}
