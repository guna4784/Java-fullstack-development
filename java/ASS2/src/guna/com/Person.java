package guna.com;

public class Person {
		    String name;
		    int age;

		    public Person(String name, int age) {
		        this.name = name;
		        this.age = age;
		    }
		    // Getter methods
		    public String getName() {
		        return name;
		    }

		    public int getAge() {
		        return age;
		    }
		    public static void main(String[] args) {
		        Person person1 = new Person("Alice", 25);
		        Person person2 = new Person("Bob", 30);

		        System.out.println("Person 1: " + person1.getName() + ", Age: " + person1.getAge());
		        System.out.println("Person 2: " + person2.getName() + ", Age: " + person2.getAge());
		    }
		
	}

