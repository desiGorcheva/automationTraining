package inclass;

public class Car {
	double maxSpeed;
	double currentSpeed;
	String color;
	int gear;
	Person owner;
	
	void accelerate() {
		if(currentSpeed >= maxSpeed) {
			System.out.println("Na maksimalna skorost si sha umresh");
		} else {
			currentSpeed += 10;
			System.out.println("Your speed has been increased to " + currentSpeed);
		}
	}
	
	void changeGearUp(){
		if(gear >= 1 && gear < 5) {
			gear++;
			System.out.println("Your gear has been changed to " + gear);
		} else {
			System.out.println("Veche si na 5-ta brq");
		}
	}
	
	void changeGearDown(){
		if(gear <= 5 && gear > 1) {
			gear--;
			System.out.println("Your gear has been changed to " + gear);
		} else {
			System.out.println("Veche si na 1-va ua");
		}
	}
	
	void changeGear(int nextGear) {
		if(nextGear <= 5 && nextGear >= 1) {
			gear = nextGear;
			System.out.println("Your gear has been changed to " + gear);
		} else {
			System.out.println("Nqma takava skorost be");
		}
	}
	
	void changeColor(String newColor) {
		color = newColor;
		System.out.println("Your color has been changed to " + color);
	}
	
	
}
