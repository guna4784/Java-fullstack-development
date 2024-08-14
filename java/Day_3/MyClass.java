class A {
    A() {
        super();
    System.out.println("A");
    }
    A(int a) {
    System.out.println("A 1");
    }
    }
    class B extends A {
    B() {
    super();
    System.out.println("B");
    }
    }
    public class MyClass {
    public static void main(String[] args) {
    B b = new B();
    }
}