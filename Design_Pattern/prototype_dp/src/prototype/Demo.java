package prototype;

public class Demo {

	public static void main(String args[]) {
		Dog dog = new Dog();
		
		Dog clonedDog = dog.makeClone();
		
		System.out.println(dog.toString());
		System.out.println(clonedDog.toString());
	}

}
