package lp_one;

public class Application {

	public static void main(String args[]) {

		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setCode("emp100");
		emp1.setName("Nimal");
		emp1.setNic("9245411v");
		emp1.setAddress("123b,town road,newtown");

		Employee emp2 = new Employee();
		emp2.setId(101);
		emp2.setCode("emp101");
		emp2.setName("Saman");
		emp2.setNic("8245411v");
		emp2.setAddress("456,town road,newtown");

		Employee emp3 = new Employee();
		emp3.setId(102);
		emp3.setCode("emp102");
		emp3.setName("kamal");
		emp3.setNic("7245411v");
		emp3.setAddress("752,town road,newtown");

		System.out.println(emp1.equals(emp3)); // false
		System.out.println(emp1.equals(emp2)); // false
		System.out.println(emp2.equals(emp3)); // false

		System.out.println(emp3.equals(emp3)); // true
		System.out.println(emp2.equals(emp2)); // true
		System.out.println(emp1.equals(emp1)); // true
	}
}
