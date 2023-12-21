package com.java.dto;

public class CarMain {

	public static void main(String[] args) {
		// 11/28(화)

		Car car = new Car(); //car안에 여러 객체가 들어가있다해도 어쨌든 car.
		System.out.println("바퀴 개수: "+car.wheel);
		
//		car = new FireEngine(); //car는 car이기도 하면서 FireEngine.
//		FireEngine f = (FireEngine)car; // (FireEngine)를 넣었기에 car이기도 하면서 FireEngine.
//		System.out.println("바퀴 개수: "+car.wheel);
////		System.out.println("브레이크 개수: "+car.breakk);
////		System.out.println("악셀 개수: "+car.axel);
//		System.out.println("물탱크 개수: "+f.waterTank);
		
		car = new FireEngine(); 
		if(car instanceof FireEngine) {
			
			car = new Car();
			
			car.speedUp(); //부모
			car.speedDown(); //부모
			System.out.println(car.wheel);
			System.out.println("-----------------------------");
			
			
			FireEngine f = new FireEngine();
//			System.out.println("부모 바퀴 개수: "+car.wheel);
//			System.out.println("자식 바퀴개수: "+f.wheel);
			car = f;
			
			car.speedUp(); //자식
			f.speedUp(); //자식
			System.out.println(car.wheel);
			System.out.println(((FireEngine)car).wheel);
			
			
		}else {
			System.out.println("Ambulance는 인스턴스가 아닙니다.");
		}
		
//		car = new FireEngine(); //car는 car이기도 하면서 FireEngine.
//		FireEngine f = (FireEngine)car; // (Ambulance)를 넣었기에 car이기도 하면서 Ambulance.
//		System.out.println("바퀴 개수: "+car.wheel);
//		System.out.println("약 개수: "+a.medicine);
//		
		
	}

}
