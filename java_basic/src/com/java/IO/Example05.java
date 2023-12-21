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
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			try {
				FileReader fis = new FileReader(file);
				BufferedReader br = new BufferedReader(fis);
				
				String str = null;
				int i = 0;
				while((str = br.readLine()) != null) {
					System.out.println(str); // str 다음에 개행문자 "\n"를 넣어주면 줄바꿈을 해줄 수 있다. 
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

