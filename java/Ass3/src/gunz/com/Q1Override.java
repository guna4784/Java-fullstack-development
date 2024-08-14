package gunz.com;

class Animal{
	void makeSound() {
		System.out.println("make sound");
	}
}

class Cat extends Animal{
	void makesound() {
		System.out.println(" cat make sound");
	}
}

public class Q1Override {
	public static void main(String[] args) {

	Cat cat =new Cat();
	cat.makesound();
	}

}
