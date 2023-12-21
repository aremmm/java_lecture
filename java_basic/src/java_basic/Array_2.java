package java_basic;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		국어 영어 수학 과학 총점 평균 => 라벨
//		90   65   70   80             => 점수
		
//		String[] label = {"국어","영어","수학","과학"};
//		int[] score = {90,65,70,80};
		
		String[] label = {"순번","국어","영어","수학","과학","총점","평균"};
		String[] name = {"이민호","이상재","나재길","탁재훈"};
		
		int[] kor = {71,81,91,61};
		int[] eng = {72,82,92,62};
		int[] math = {73,83,93,63};
		int[] sci = {74,84,94,64};
		int[] total = new int[4]; //[] 안의 수는 과목 수만큼
		float[] avg = new float[4];
		
		for(int stuNum = 0;stuNum < 4;stuNum++) {
			total[stuNum] = kor[stuNum]+eng[stuNum]+math[stuNum]+sci[stuNum];
			avg[stuNum] = (int)((total[stuNum]/4f))*100+0.5f/100f;
		}
		
		total[0] = kor[0]+eng[0]+math[0]+sci[0];
		avg[0] = (int)((total[0]/(float)(label.length-2))*100+0.5f)/1000f;
		
		for(int i=0;i<label.length;i++) {
			System.out.println(label[i]+"\t");
		}
		System.out.println();
		
		for(int stuNum = 0;stuNum < 4;stuNum++) {
			System.out.println(label[stuNum]+"\t"+name[stuNum]+"\t"
								+kor[stuNum]+"\t"+eng[stuNum]+"\t"
								+math[stuNum]+"\t"+sci[stuNum]+"\t"
								+total[stuNum]+"\t"+avg[stuNum]+"\t");
		}
		
//		System.out.println(label[0]+":"+kor[0]);
//		System.out.println(label[1]+":"+eng[0]);
//		System.out.println(label[2]+":"+math[0]);
//		System.out.println(label[3]+":"+sci[0]);
//		System.out.println(label[4]+":"+total[0]);
//		System.out.println(label[5]+":"+avg[0]);
		
		
//		for(int i=0; i<label.length;i++) { //i는 0부터 시작하고. i는label.length보다 작고. i는 하나씩 증가.
//			System.out.println(label[i]+":"+score[1]);
//			System.out.println(label[i]+":"+score[i]);
		}

		

		
//		int temp = 90+65+70+80;
//		System.out.println("총점: "+temp);
//		
		
		
		
		
	}


