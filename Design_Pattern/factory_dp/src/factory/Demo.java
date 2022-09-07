package factory;

public class Demo {

	public static void main(String args[]) {

		ProfileFactory factory = new ProfileFactory();

		Profile profile = factory.makeProfile("Manager");
		profile.loginToSystem();
		profile.viewDetails();
		
		profile = factory.makeProfile("Analyst");
		profile.loginToSystem();
		profile.viewDetails();
		

		profile = factory.makeProfile("Developer");
		profile.loginToSystem();
		profile.viewDetails();

	}

}
