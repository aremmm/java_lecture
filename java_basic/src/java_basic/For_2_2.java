package java_basic;

public class For_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = "";
		
		for(int dan=2; dan<10; dan++) { // ��(dan)�� 
			for(int gop=1; gop<10; gop++) { // ��(gop)�� ���� 10���ϱ��� 1�� �ݺ�.
				result = result+(dan+"*"+gop+"="+dan*gop);
			result = result+"\n";
			
			System.out.println(result);
			
			
			
		}
			
		}
	}

}
