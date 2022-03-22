package Singleton;

public class Database {
	private int id;
	private String URL;
	private void selectObj() {
		
	}
	
	Database(){
		//connect
	}
	
	Database(int id, String url){
		this.id = id;
		this.URL = url;
	}
		
	private static Database INSTANCE;
	public static Database getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Database();
		}
		return INSTANCE;
	}
}
