package com.java.IO;

import java.io.File;
import java.io.IOException;

public class Example01 {
	
	public static void main(String[] args) {
			// 231218(mon)
			
		File filePath = new File("c:\\temp\\java\\file");
		File fileObj = new File("c:\\temp\\java\\file","example01.txt"); //���� ��� �ְ�
		try {
			
			fileObj.mkdirs(); //mkdirs�� ���� ��θ� ������ش�.
			
			boolean success = fileObj.createNewFile();
			
			if(success) {
				System.out.println("���� ���� ����");
			}else {
				System.out.println("���� ���� ����");
			}
			if(fileObj.exists()) {
				System.out.println(fileObj.getPath()); //getPath�� ���ϰ�� ��������
				System.out.println(fileObj.getName()); //getName�� �����̸� ��������
				System.out.println(fileObj.getAbsolutePath()); //
//				System.out.println(fileObj.exists()); // �ִ��� ������ �˷��ִ� ��.
				System.out.println(fileObj.canRead()); //�бⰡ ��������?
				System.out.println(fileObj.canWrite()); // ���Ⱑ ��������?
				System.out.println(fileObj.length()); // ���̸� �˷��ִ� ���.
				System.out.println(filePath.list()); // list�� �������µ� �迭�� �����´�.

			}
//			fileObj.delete(); //������ ����� ��.������ �����ȴ�.
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
