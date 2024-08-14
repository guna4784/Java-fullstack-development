class Dog {
    String breed;
    int age;
    String color;

    void bark() {
        System.out.println("Woof");
    }
}

public class CreateObj{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed = "Labrador";
        dog1.age = 3;
        dog1.color = "Black";

        dog1.bark();
    }
}
