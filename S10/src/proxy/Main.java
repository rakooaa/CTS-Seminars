package proxy;

public class Main {

	public static void main(String[] args) {
		ILoginModule loginModule=new LoginModule("user23", "12334");
		String[] dictionaryPassword=new String[] {"1234", "12543", "1324", "12345", "123pass", "12334"};
	
		
		//varianta fara proxy
		for (String pass:dictionaryPassword)
		{
			if(loginModule.login("user23", pass))
				System.out.println("succesfully logged in without proxy");
			
		}
		
		//varianta proxy
		LoginProxy proxyLoginProxy=new LoginProxy(loginModule);
		
		for (String pass:dictionaryPassword)
		{
			if(proxyLoginProxy.login("user23", pass))
				System.out.println("succesfully logged in");
			else
				System.out.println("unsuccesfully logged in");
		}
	}
}
