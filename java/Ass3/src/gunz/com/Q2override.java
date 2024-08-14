package gunz.com;

class  Vehicle{
	void drive() {
		System.out.println("Car is ready");
	}
}
class Fourweeler extends Vehicle{
	void drive() {
		System.out.println("Repairing a car");
	}
}
public class Q2override {
	public static void main(String[] args) {
		Fourweeler fourweeler =new Fourweeler();
		fourweeler.drive();
		
	}

}
