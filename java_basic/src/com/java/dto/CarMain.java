package com.java.dto;

public class CarMain {

	public static void main(String[] args) {
		// 11/28(ȭ)

		Car car = new Car(); //car�ȿ� ���� ��ü�� ���ִ��ص� ��·�� car.
		System.out.println("���� ����: "+car.wheel);
		
//		car = new FireEngine(); //car�� car�̱⵵ �ϸ鼭 FireEngine.
//		FireEngine f = (FireEngine)car; // (FireEngine)�� �־��⿡ car�̱⵵ �ϸ鼭 FireEngine.
//		System.out.println("���� ����: "+car.wheel);
////		System.out.println("�극��ũ ����: "+car.breakk);
////		System.out.println("�Ǽ� ����: "+car.axel);
//		System.out.println("����ũ ����: "+f.waterTank);
		
		car = new FireEngine(); 
		if(car instanceof FireEngine) {
			
			car = new Car();
			
			car.speedUp(); //�θ�
			car.speedDown(); //�θ�
			System.out.println(car.wheel);
			System.out.println("-----------------------------");
			
			
			FireEngine f = new FireEngine();
//			System.out.println("�θ� ���� ����: "+car.wheel);
//			System.out.println("�ڽ� ��������: "+f.wheel);
			car = f;
			
			car.speedUp(); //�ڽ�
			f.speedUp(); //�ڽ�
			System.out.println(car.wheel);
			System.out.println(((FireEngine)car).wheel);
			
			
		}else {
			System.out.println("Ambulance�� �ν��Ͻ��� �ƴմϴ�.");
		}
		
//		car = new FireEngine(); //car�� car�̱⵵ �ϸ鼭 FireEngine.
//		FireEngine f = (FireEngine)car; // (Ambulance)�� �־��⿡ car�̱⵵ �ϸ鼭 Ambulance.
//		System.out.println("���� ����: "+car.wheel);
//		System.out.println("�� ����: "+a.medicine);
//		
		
	}

}
