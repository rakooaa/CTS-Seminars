package builder;

public class user {
	//mandatory
	String userName;
	String password;
	String email;
	
	//optional
	String address;
	String phoneNo;
	String birthday;
	
	public user(String userName, String password, String email, String address, String phoneNo, String birthday) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phoneNo = phoneNo;
		this.birthday = birthday;
	}
	
	public user(String userName, String password, String email, String address) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = address;
	
		
}
	
	public user(String userName, String password, String email, String noPhone) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = noPhone;
	
		
}
}
