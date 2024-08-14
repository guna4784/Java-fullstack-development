package gunz.com;

class  Employeework{
	void  work() {
		System.out.println("First month work");
	}
}
class  Employeesalary{
	void  getSalary() {
		System.out.println("First month Salary");
	}
}
class  Employeework1 extends Employeework {
	void  work() {
		System.out.println("First month work");
	}
}
class  Employeesalary1 extends Employeesalary{
	void  getSalary() {
		System.out.println("First month Salary");
	}
}
class  NweEmployee{
	void  addEmployee() {
		System.out.println("New employee details");
	}
}

public class Q4override {
	public static void main(String[] args) {
		Employeework1 Emp =new Employeework1();
		Emp.work();
		Employeesalary1 Empsalary =new Employeesalary1();
		Empsalary.getSalary();	
	}

}
