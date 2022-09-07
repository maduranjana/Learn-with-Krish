package factory;

public abstract class Profile {

	String name;
	int experience;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void loginToSystem() {
		System.out.println(name + " Logged to System");
	}

	public void viewDetails() {
		System.out.println(name + " has " + experience + " years experiences");
	}

}
