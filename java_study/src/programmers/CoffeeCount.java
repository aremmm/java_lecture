package programmers;

public class CoffeeCount {

//	public static void main(String[] args) {
		// 231218(mon) ���α׷��ӽ�
//		���� ������ ö���� �Ƹ޸�ī��� ī�� ���׸� �Ǹ��ϴ� ī�信�� �������� Ŀ�Ǹ� ����� �մϴ�.
//		�Ƹ޸�ī��� ī�� ������ ������ ������ �Ͱ� �߰ſ� �� ������� ���� 4500, 5000���Դϴ�.
//		�� �������� ���� �޴��� ����޶�� �Ͽ���, �� �߿��� �޴��� ���� ������ ���� ������ ������ �����ϰ�
//		"�ƹ��ų�"�� ���� ������ ���� ������ �Ƹ޸�ī��� �����ϱ�� �Ͽ����ϴ�.
//		�� ������ ���� �޴��� ���ڿ� �迭 order�� �־��� ��,
//		ī�信�� �����ϰ� �� �ݾ��� return �ϴ� solution �Լ��� �ۼ����ּ���


	private static int solution(String[] order1) {
		
		int answer = 0;
		
		for(int i=0; i<order.length; i++) {
			if(order[i].contains("americano") || order[i].equals("anything")) {
				answer+=4500;
				// if������ �迭�� ���Ұ��� i�̰� americano�� anything�� ��� 4500��
			}else {
				answer+=5000; // �ƴҰ�쿡�� 5000��
			}
		}
		return answer;
	}

}
// americano�� anything�� 4500��, cafelatte�� 5000��.
