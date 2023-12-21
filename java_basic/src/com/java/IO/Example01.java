package com.java.IO;

import java.io.File;
import java.io.IOException;

public class Example01 {
	
	public static void main(String[] args) {
			// 231218(mon)
			
		File filePath = new File("c:\\temp\\java\\file");
		File fileObj = new File("c:\\temp\\java\\file","example01.txt"); //파일 경로 넣고
		try {
			
			fileObj.mkdirs(); //mkdirs가 파일 경로를 만들어준다.
			
			boolean success = fileObj.createNewFile();
			
			if(success) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			}
			if(fileObj.exists()) {
				System.out.println(fileObj.getPath()); //getPath는 파일경로 가져오기
				System.out.println(fileObj.getName()); //getName는 파일이름 가져오기
				System.out.println(fileObj.getAbsolutePath()); //
//				System.out.println(fileObj.exists()); // 있는지 없는지 알려주는 것.
				System.out.println(fileObj.canRead()); //읽기가 가능한지?
				System.out.println(fileObj.canWrite()); // 쓰기가 가능한지?
				System.out.println(fileObj.length()); // 길이를 알려주는 출력.
				System.out.println(filePath.list()); // list를 가져오는데 배열로 가져온다.

			}
//			fileObj.delete(); //파일을 지우는 것.완전히 삭제된다.
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
