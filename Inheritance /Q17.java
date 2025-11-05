package inheritance;
// Q17
class Animal {
    void eat() {
        System.out.println("This animal is eating...");
    }
}


class Lion extends Animal {
    void roar() {
        System.out.println("The lion roars loudly!");
    }
}


public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion = new Lion();

	     lion.eat();
	     lion.roar();	

	}
	 
}
