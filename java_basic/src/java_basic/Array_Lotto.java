package java_basic;
import java.util.Scanner;

public class Array_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      11/23(��) Quiz_4
//		�ζ� ���α׷��� �ۼ��Ͻÿ�.(1���� 45������ ������ ���� 5�� �̱�)
//		����) 
//		�ݾ��� �Է�: 3000
//		34 23 22 21 11 2
//		43 12 11 19 18 7
//		17 32 12 16 4  5
//		
//		�ݾ��� �Է�: 3200
//		3  41 12 21 11 2
//		40 8  20 10 6  7
//		19 15 13 11 8  6
//		
//		�Ž�����: 200
		
		final int PRICE_PER_LOTTO = 1000; // �ζ� 1ȸ�� �ݾ�
		int[] lotto_num = new int[45]; // 45������ ���� ���
		int[][] output_num; // �ζ� ��÷��ȣ
		int inMoney; // ���� �ݾ�
		int lottoCnt; // �ζ� Ƚ��
		int changeMoney; // �Ž�����
		
		Scanner scann = new Scanner(System.in);
		//�Է�.
		System.out.println("�ݾ� �Է�: ");
		inMoney = scann.nextInt();scann.nextLine(); //�ݾ� �Է¹ް�
		lottoCnt = inMoney / PRICE_PER_LOTTO; // ���� �ݾ����� �ζǴ� ��� ����?
		changeMoney = inMoney % PRICE_PER_LOTTO; // ���� �ݾ��� ������(�Ž�����) ���
		output_num = new int[lottoCnt][6];
		//ó��.
		for(int i=1; i<46; i++) {
			lotto_num[i-1]=i;
			
		}
		for(int count=0; count<lottoCnt; count++) {
			
		int temp =0;
		for(int i=0; i<45*100; i++) {//45������ ���ڵ��� �� 100�� �����Ŵ�.��� ��
			int tempIndex = (int)(Math.random()*45);
			temp=lotto_num[0];
			lotto_num[0]=lotto_num[tempIndex];
			lotto_num[tempIndex]=temp;
		}
	
		for (int i=0; i<6; i++) {
			output_num[count][i] = lotto_num[i];
			
		}
	}
		//���.
		for (int i=0; i<output_num.length; i++) { //�ζ���÷��ȣ ~45���� ����
			for(int j=0; j<output_num[i].length; j++) {
				System.out.print(output_num[i][j]+"\t");
			}
			System.out.println();
			
		}
		System.out.println("�Ž�����: "+changeMoney);
		
//		final int Lotto_Money =1000; //�ζ� 1ȸ�� �ݾ�
//		int[] Num = new int[45]; //1~45������ ���� ���
//		int[] randomNum = new int[45]; //1~45������ ��������(���Ǽ���) ���
//		int Lotto; //scanner�� �Է¹޴� ����(�ζ�)
//		int LottoNum; //�ζ� Ƚ��
//		int change; //�Ž�����(������)
//		
//		Scanner scann = new Scanner(System.in);
//		System.out.println("�ݾ��� �Է��ϼ���: ");
//		Lotto = scann.nextInt(); //�ݾ� �Է¹ް�,
//		LottoNum = Lotto / Lotto_Money;//���� �ݾ����� �ζǸ� ��� �����Ұ���?
//		change = Lotto % Lotto_Money; //���� �ݾ��� ������ ���
//		
//		for (int i=0; i<Num.length; i++) { 
//			Num[i]=i+1; //1~45���� ����
//		}
//		for(int n=0; n<LottoNum; n++) {
//			randomNum[n] = 
//			
//		System.out.println("�Ž�����: "+change);
//			
//		}
//		int[] Lotto = new int[6];
//		Random random = new Random();
//		
//		for (int i=0; i<Lotto.length; i++) { //������ȣ ����.
//			Lotto[i] = random.nextInt(45)+1;
			
		}
	}


