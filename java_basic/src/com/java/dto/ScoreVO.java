package com.java.dto;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScoreVO implements Comparable<ScoreVO> {
	
		
//	1124(Fri)/ 1218(Mon): date객체,hashcode
	
	private String stuNum; //학번 생성.(학번이라고 숫자로 생각하면 안됨. 문자열임.문자열이니까 string.)
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
	
	public void input() { //int값을 반환해줄 필요가 없다는 뜻.
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("학번: ");
		stuNum=scann.nextLine();
		
		System.out.println("이름: ");
		name=scann.nextLine();
		System.out.println("국어: ");
		kor=scann.nextInt();scann.nextLine();
		System.out.println("영어: ");
		eng=scann.nextInt();scann.nextLine();
		System.out.println("수학: ");
		math=scann.nextInt();scann.nextLine();
		System.out.println("과학: " );
		sci=scann.nextInt();scann.nextLine();
		
		regDate=new Date();
		
	}
	public static void printlabel() { //static은 변하지 않는 것. 고정된 것.
		System.out.println("학번\t이름\t국어\t영어\t수학\t과학\t총점\t평균\t등록일");
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
//		if (!(o instanceOf ScoreVO)) return -1;  //o가 ScoreVO가 아닐때.
//			
//		ScoreVO other = (ScoreVO)o; // ScoreVO가 아닐때만 오도록.
//		return this.total() - other.total();
//		return this.name.compareTo(other.getName());
		//this.name이 (other.getName())을 compareTo(비교)해라. 이름차순으로 정렬되도록.
//		return this.name.compareTo(other.getName());

		}
	}
	



