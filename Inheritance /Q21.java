package inheritance;
//	Q21
class Appliance {
    String brand;
    int power; 

    Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Power: " + power + "W");
    }
}

class Fan extends Appliance {
    int speedLevels;

    Fan(String brand, int power, int speedLevels) {
        super(brand, power);
        this.speedLevels = speedLevels;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Speed Levels: " + speedLevels);
    }
}

class CeilingFan extends Fan {
    String bladeMaterial;

    CeilingFan(String brand, int power, int speedLevels, String bladeMaterial) {
        super(brand, power, speedLevels);
        this.bladeMaterial = bladeMaterial;
    }

    void rotate() {
        System.out.println("Ceiling fan is rotating with " + bladeMaterial + " blades.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Blade Material: " + bladeMaterial);
    }
}

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CeilingFan ceilingFan = new CeilingFan("Havells", 75, 5, "Aluminium");
        ceilingFan.displayInfo();
        ceilingFan.rotate();
	}

}
