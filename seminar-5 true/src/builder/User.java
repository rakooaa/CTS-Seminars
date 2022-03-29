package builder;

public class User {
	//mandatory attributes
	private String username;
	private String firstName;
	private String lastName;
	
	//optional attributes
	private String birthday;
	private String address;
	private String phone;
	
	User(String username, String fistName, String lastName){
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	User(String username, String fistName, String lastName, String birthday){
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
}
