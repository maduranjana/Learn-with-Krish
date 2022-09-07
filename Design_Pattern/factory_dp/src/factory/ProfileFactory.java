package factory;

public class ProfileFactory {

	public Profile makeProfile(String type) {

		switch (type) {
		
		case "Manager":
			return new ManagerProfile();
			
		case "Analyst":
			return new AnalystProfile();
			
		case "Developer":
			return new DeveloperProfile();
			
		default:
			return null;

		}

	}
}
