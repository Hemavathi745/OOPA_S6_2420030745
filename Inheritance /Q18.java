package inheritance;
// Q18
class Vehicle {
    void move() {
        System.out.println("The vehicle is moving...");
    }
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("This car uses petrol or diesel.");
    }
}

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car = new Car();
	        car.move();
	        car.fuelType();
	}

}
