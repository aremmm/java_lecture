package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int STUDEN_NUM;
	
		Scanner scann = new Scanner(System.in);
		

		System.out.println("�л� ��: ");
		STUDEN_NUM = scann.nextInt();scann.nextLine();
		
		ScoreVO[] scores = new ScoreVO[STUDEN_NUM];
		
		// �Է�.
		for(int i=0; i<STUDEN_NUM; i++) {
			scores[i]=new ScoreVO();
			scores[i].input();
		}
		// ���.
		System.out.println("����\t");
		ScoreVO.printlabel();
		for(int i=0; i<STUDEN_NUM; i++) {
			System.out.println((i+1)+"\t");
			scores[i].printScore();
		}
			
//			System.out.println("�̸�: ");
//			scores[i].name=scann.nextLine();
//			System.out.println("����: ");
//			scores[i].kor=scann.nextInt();scann.nextLine();
//			System.out.println("����: ");
//			scores[i].eng=scann.nextInt();scann.nextLine();
//			System.out.println("����: ");
//			scores[i].math=scann.nextInt();scann.nextLine();
//			System.out.println("����: " );
//			scores[i].sci=scann.nextInt();scann.nextLine();
//		}
		
//		System.out.println("����\t�̸�\t����\t����\t����\t����\t����\t���");
//		for(int i=0; i<STUDEN_NUM; i++) {
//			System.out.println((i+1)+"\t"+scores[i].name
//									+"\t"+scores[i].kor
//									+"\t"+scores[i].eng
//									+"\t"+scores[i].math
//									+"\t"+scores[i].sci
//									+"\t"+scores[i].total()
//									+"\t"+scores[i].avg());
					
		}
		
	}


