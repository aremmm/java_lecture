package programmers;

public class CoffeeCount {

//	public static void main(String[] args) {
		// 231218(mon) 프로그래머스
//		팀의 막내인 철수는 아메리카노와 카페 라테만 판매하는 카페에서 팀원들의 커피를 사려고 합니다.
//		아메리카노와 카페 라테의 가격은 차가운 것과 뜨거운 것 상관없이 각각 4500, 5000원입니다.
//		각 팀원에게 마실 메뉴를 적어달라고 하였고, 그 중에서 메뉴만 적은 팀원의 것은 차가운 것으로 통일하고
//		"아무거나"를 적은 팀원의 것은 차가운 아메리카노로 통일하기로 하였습니다.
//		각 직원이 적은 메뉴가 문자열 배열 order로 주어질 때,
//		카페에서 결제하게 될 금액을 return 하는 solution 함수를 작성해주세요


	private static int solution(String[] order1) {
		
		int answer = 0;
		
		for(int i=0; i<order.length; i++) {
			if(order[i].contains("americano") || order[i].equals("anything")) {
				answer+=4500;
				// if문으로 배열의 원소값은 i이고 americano나 anything일 경우 4500원
			}else {
				answer+=5000; // 아닐경우에는 5000원
			}
		}
		return answer;
	}

}
// americano와 anything은 4500원, cafelatte는 5000원.
