package inheritance;
// Q19
class AnimalS {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}


public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Puppy puppy = new Puppy();
		        puppy.eat();
		        puppy.bark();
		        puppy.weep();

	}

}
