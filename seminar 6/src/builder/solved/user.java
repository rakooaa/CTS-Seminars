package builder.solved;

import builder.solved.user.Userbuilder;

public class user {
	//mandatory
	String userName;
	String password;
	String email;
	
	//optional
	String address;
	String phoneNo;
	String birthday;
	
	public user(Userbuilder userbuilder) {
		super();
		this.userName = userbuilder.userName;
		this.password = userbuilder.password;
		this.email = userbuilder.email;
		this.address = userbuilder.address;
		this.phoneNo = userbuilder.phoneNo;
		this.birthday = userbuilder.birthday;
	}
	
	public class Userbuilder{
		String userName;
		String password;
		String email;
		
		//optional
		String address;
		String phoneNo;
		String birthday;
		
		Userbuilder(String userName, String password, String email){
			this.userName = userName;
			this.password = password;
			this.email = email;}
		
	
	Userbuilder address(String address) {
		this.address = address;
		return this;
	}
	
	Userbuilder phoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
		return this;
	}
	
	Userbuilder birthday(String birthday) {
		this.birthday = birthday;
		return this;
	}
	
	public user build() {
		user user = new user(this);
		return user;
	}
}
	
}