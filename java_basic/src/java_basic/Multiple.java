package java_basic;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
//		  11/21(ȭ)
//		quiz 2)
//		������ ������ �Է¹޾� 2, 3, 5�� ������� �Ǵ��ϴ� ���α׷� ���.
//		����)
//		������ �Է��Ͻÿ�.
//		6
//		2, 3�� ����Դϴ�.
//		����)
//		������ �Է��Ͻÿ�.
//		30
//		2, 3, 5�� ����Դϴ�.
		
			int inputInt=0;
			String result = "";
			
			Scanner scan = new Scanner(System.in);
			System.out.println("������ �Է��Ͻÿ�.");
			inputInt = scan.nextInt();
			
			boolean condition = inputInt % 2 != 0 
						     && inputInt % 3 != 0 
						     && inputInt % 5 != 0;
			if(condition) {
				result = "2, 3, 5�� ����� �ƴմϴ�.";
			}else {
				if(inputInt % 2 == 0) {
					result = result + "2";
					if(inputInt % 3 == 0) {
						result = result + ", 3";
						if(inputInt % 5 == 0) {
							result = result + ", 5 ����Դϴ�.";
						}else {
							result = result + "����Դϴ�.";
						}
					}else {
						if(inputInt % 5 == 0) {
							result = result + "5�� ����Դϴ�.";
						}else {
							result = result + "����Դϴ�.";
						}
					}
				}else {
					if(inputInt % 3 == 0) {
						result = result + "3, ";
						if(inputInt % 5 == 0) {
							result = result + "5�� ����Դϴ�.";
						}else {
							result = result + "����Դϴ�.";
						}
					}else {
						if(inputInt % 5 == 0) {
							result = result + "5�� ����Դϴ�.";
						}else {
							result = result + "����Դϴ�.";
						}
					}
				}
				
			}
			
			System.out.println(result);

		}

	}


