package prototype.solved;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bookshop carturesti = Bookshop.LoadDataFromDB("carturesti");
		Bookshop diverta = (Bookshop) carturesti.clone();
	}

}
