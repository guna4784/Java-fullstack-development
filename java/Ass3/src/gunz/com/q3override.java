package gunz.com;

class Shape{
	void GetArea() {
		System.out.println("shape created");
	}
}
class Angle extends Shape{
	void GetArea(int a,int b) {
		System.out.println(" Area of a rectangle:"+a*b);
	}
}

public class q3override {
	public static void main(String[] args) {
		Angle angle =new Angle();
		angle.GetArea(10,3);
	}

}
