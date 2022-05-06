package proxy;

public class LoginModule implements ILoginModule {

	private String username;
	private String password;
	
	public LoginModule(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean login(String username, String pasword) {
		// TODO Auto-generated method stub
		if(this.username.equals(username)&& this.password.equals(pasword))
			return true;
		return false;
	}	
}
