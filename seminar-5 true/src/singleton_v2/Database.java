package singleton_v2;


public class Database {
	
	private static Database INSTANCE;
	
	static {
		INSTANCE =  new Database();
	}
	
	
	private Database() {
		
	}
	
	public Database getInstance() {
		return INSTANCE;
	}
}

