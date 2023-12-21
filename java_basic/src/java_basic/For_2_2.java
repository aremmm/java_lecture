package java_basic;

public class For_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = "";
		
		for(int dan=2; dan<10; dan++) { // 단(dan)은 
			for(int gop=1; gop<10; gop++) { // 곱(gop)의 값이 10이하까지 1씩 반복.
				result = result+(dan+"*"+gop+"="+dan*gop);
			result = result+"\n";
			
			System.out.println(result);
			
			
			
		}
			
		}
	}

}
