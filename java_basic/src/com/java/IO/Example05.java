package com.java.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Example05 {

	public static void main(String[] args) {
		// 231219(tue)
		
//		try {
			File file = new File("Gugudan.txt");
			if(!file.exists()) {
				System.out.println("������ �������� �ʽ��ϴ�.");
				return;
			}
			try {
				FileReader fis = new FileReader(file);
				BufferedReader br = new BufferedReader(fis);
				
				String str = null;
				int i = 0;
				while((str = br.readLine()) != null) {
					System.out.println(str); // str ������ ���๮�� "\n"�� �־��ָ� �ٹٲ��� ���� �� �ִ�. 
				}
			
//			FileReader fis = new FileReader(file);
//			int i = 0;
//			while((i= fis.read()) != -1) {
//				System.out.println((char)i);
//			}
				fis.close();
			}catch(Exception e) {
				System.out.println(e);
			}

	}

}

