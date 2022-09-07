package prototype;

public class Dog implements Cloneable {

	public Dog() {
		System.out.println("Dog is created");
	}

	public Dog makeClone() {

		Dog dog = null;

		try {

			dog = (Dog) super.clone();

		} catch (CloneNotSupportedException e) {

			System.out.println("Cloning Failed");
		}

		return dog;
	}

	@Override
	public String toString() {

		return this.hashCode() + "";
	}

}
