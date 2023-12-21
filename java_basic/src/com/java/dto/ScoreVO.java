package com.java.dto;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScoreVO implements Comparable<ScoreVO> {
	
		
//	1124(Fri)/ 1218(Mon): date��ü,hashcode
	
	private String stuNum; //�й� ����.(�й��̶�� ���ڷ� �����ϸ� �ȵ�. ���ڿ���.���ڿ��̴ϱ� string.)
	private String name;
	
	private int kor;
	private int math;
	private int eng;
	private int sci;
	
	private Date regDate;
	
	public String getStuNum() {
		return stuNum;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int total() {
		return kor+math+eng+sci;
		
	}
	public float avg() {
		return ((int)(total()/4f*100+0.5))/100f;
		
	}
	
	public void input() { //int���� ��ȯ���� �ʿ䰡 ���ٴ� ��.
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("�й�: ");
		stuNum=scann.nextLine();
		
		System.out.println("�̸�: ");
		name=scann.nextLine();
		System.out.println("����: ");
		kor=scann.nextInt();scann.nextLine();
		System.out.println("����: ");
		eng=scann.nextInt();scann.nextLine();
		System.out.println("����: ");
		math=scann.nextInt();scann.nextLine();
		System.out.println("����: " );
		sci=scann.nextInt();scann.nextLine();
		
		regDate=new Date();
		
	}
	public static void printlabel() { //static�� ������ �ʴ� ��. ������ ��.
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t����\t���\t�����");
	}
	public void printScore() {
		
		SimpleDateFormat stdFormat = new SimpleDateFormat("yyy=MM-dd");
		
		String regDate = stdFormat.format(this.regDate);
		String today = stdFormat.format(new Date());
		
		if(regDate.equals(today)) {
			regDate = new SimpleDateFormat("HH:mm:ss").format(this.regDate);
		}
		
		System.out.println(stuNum+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sci+"\t"+total()+"\t"+avg()+
							"\t"+regDate);
	}
	@Override
	public int hashCode() {
		return stuNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ScoreVO) {
			ScoreVO other = (ScoreVO)obj;
			return other.stuNum.equals(stuNum);
		}else {
			return false;
		}
	}

	@Override
	public int compareTo(ScoreVO other) {
		if(this.stuNum.contentEquals(other.stuNum)) {
			return 0;
		}else {
			return other.getRegDate().compareTo(this.regDate);
		}
//		if (!(o instanceOf ScoreVO)) return -1;  //o�� ScoreVO�� �ƴҶ�.
//			
//		ScoreVO other = (ScoreVO)o; // ScoreVO�� �ƴҶ��� ������.
//		return this.total() - other.total();
//		return this.name.compareTo(other.getName());
		//this.name�� (other.getName())�� compareTo(��)�ض�. �̸��������� ���ĵǵ���.
//		return this.name.compareTo(other.getName());

		}
	}
	



