package inclass;

import java.util.Arrays;

public class CarDemo {

	public static void main(String[] args) {
		Car lada = new Car();
		Car mercedes = new Car();
		
		Person ivan = new Person();
		Person maria = new Person();
		ivan.name = "Ivan Ivanov";
		maria.name = "Maria Georgieva";
		
		ivan.friend = maria;
		maria.friend = ivan;
		
//		System.out.println(ivan.friend.name);
		
		
		lada.color = "white";
		lada.currentSpeed = 10;
		lada.gear = 1;
		lada.maxSpeed = 200;
		lada.owner = ivan;
		
		
		mercedes.color = "yellow";
		mercedes.currentSpeed = 0;
		mercedes.gear = 1;
		mercedes.maxSpeed = 50;
		mercedes.owner = maria;
		
		
//		System.out.println(mercedes.color);
//		System.out.println(lada.color);
//		
//		
//		System.out.println(lada.owner.name);
//		System.out.println(mercedes.owner.name);
		
		lada.currentSpeed = 50;

//		mercedes.accelerate();
//		mercedes.accelerate();
//		mercedes.accelerate();
//
//		mercedes.accelerate();
//
//		mercedes.accelerate();
//
//		mercedes.accelerate();
//		mercedes.accelerate();
		mercedes.changeGearUp();
		mercedes.changeGearUp();
		mercedes.changeGearUp();
		mercedes.changeGearUp();
		mercedes.changeGearUp();
		mercedes.changeGearUp();
		
		mercedes.changeGearDown();
		mercedes.changeGearDown();
		mercedes.changeGearDown();
		mercedes.changeGearDown();
		mercedes.changeGearDown();
		mercedes.changeGearDown();
		
		mercedes.changeGear(5);
		mercedes.changeGear(-1);

		lada.changeColor("black");
		
		int[] array = new int[10];
		
		
		System.out.println(Arrays.toString(array));
		
	}

}
