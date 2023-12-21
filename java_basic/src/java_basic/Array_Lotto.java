package java_basic;
import java.util.Scanner;

public class Array_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      11/23(목) Quiz_4
//		로또 프로그램을 작성하시오.(1부터 45사이의 임의의 숫자 5개 뽑기)
//		실행) 
//		금액을 입력: 3000
//		34 23 22 21 11 2
//		43 12 11 19 18 7
//		17 32 12 16 4  5
//		
//		금액을 입력: 3200
//		3  41 12 21 11 2
//		40 8  20 10 6  7
//		19 15 13 11 8  6
//		
//		거스름돈: 200
		
		final int PRICE_PER_LOTTO = 1000; // 로또 1회당 금액
		int[] lotto_num = new int[45]; // 45까지의 숫자 출력
		int[][] output_num; // 로또 추첨번호
		int inMoney; // 받은 금액
		int lottoCnt; // 로또 횟수
		int changeMoney; // 거스름돈
		
		Scanner scann = new Scanner(System.in);
		//입력.
		System.out.println("금액 입력: ");
		inMoney = scann.nextInt();scann.nextLine(); //금액 입력받고
		lottoCnt = inMoney / PRICE_PER_LOTTO; // 받은 금액으로 로또는 몇번 실행?
		changeMoney = inMoney % PRICE_PER_LOTTO; // 받은 금액의 나머지(거스름돈) 계산
		output_num = new int[lottoCnt][6];
		//처리.
		for(int i=1; i<46; i++) {
			lotto_num[i-1]=i;
			
		}
		for(int count=0; count<lottoCnt; count++) {
			
		int temp =0;
		for(int i=0; i<45*100; i++) {//45까지의 숫자들을 총 100번 섞을거다.라는 뜻
			int tempIndex = (int)(Math.random()*45);
			temp=lotto_num[0];
			lotto_num[0]=lotto_num[tempIndex];
			lotto_num[tempIndex]=temp;
		}
	
		for (int i=0; i<6; i++) {
			output_num[count][i] = lotto_num[i];
			
		}
	}
		//출력.
		for (int i=0; i<output_num.length; i++) { //로또추첨번호 ~45까지 설정
			for(int j=0; j<output_num[i].length; j++) {
				System.out.print(output_num[i][j]+"\t");
			}
			System.out.println();
			
		}
		System.out.println("거스름돈: "+changeMoney);
		
//		final int Lotto_Money =1000; //로또 1회당 금액
//		int[] Num = new int[45]; //1~45까지의 숫자 출력
//		int[] randomNum = new int[45]; //1~45까지의 랜덤숫자(임의숫자) 출력
//		int Lotto; //scanner에 입력받는 변수(로또)
//		int LottoNum; //로또 횟수
//		int change; //거스름돈(나머지)
//		
//		Scanner scann = new Scanner(System.in);
//		System.out.println("금액을 입력하세요: ");
//		Lotto = scann.nextInt(); //금액 입력받고,
//		LottoNum = Lotto / Lotto_Money;//받은 금액으로 로또를 몇번 실행할건지?
//		change = Lotto % Lotto_Money; //받은 금액의 나머지 계산
//		
//		for (int i=0; i<Num.length; i++) { 
//			Num[i]=i+1; //1~45까지 설정
//		}
//		for(int n=0; n<LottoNum; n++) {
//			randomNum[n] = 
//			
//		System.out.println("거스름돈: "+change);
//			
//		}
//		int[] Lotto = new int[6];
//		Random random = new Random();
//		
//		for (int i=0; i<Lotto.length; i++) { //랜덤번호 생성.
//			Lotto[i] = random.nextInt(45)+1;
			
		}
	}


