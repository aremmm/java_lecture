package java_basic;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputInt= 12;
		
//		switch(inputInt%2) {
//		case 0:
//			System.out.println("짝수");
//		case 1:
//			System.out.println("홀수");
			
		switch(inputInt%5) { //inoutInt의 수를 5로 나누었을때 나머지 수 찾기.
		case 0:case 1:;
			System.out.println("나머지가 0 또는 1 입니다.");
		break; // brake가 없으면 조건식이 연달아 실행됨. break는 위 조건식에서 그만 빠져나온다는 뜻.
		case 2:case 3:;
			System.out.println("나머지가 2 또는 3 입니다.");
		break;
		case 4:
			System.out.println("나머지가 4 입니다.");
		break;
		default:
			System.out.println("나머지가 5 또는 6 입니다.");
		}
		}
		
		
	}

