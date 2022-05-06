package flyweight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receipt[] listRecipt=new Receipt[50];
		ReceiptData[] reclistData=new ReceiptData[50];
		
		for ( int i=0; i<50; i++) {
			listRecipt[i]=FlyerightFactory.getReceipt(EnumReceipt.valueOf("FORMAT"+(i%3+1)));
			reclistData[i]=new ReceiptData(100+i);
		}
		for(int i=0; i<50; i++) {
			listRecipt[i].printReceipt(reclistData[i]);
		}
		System.out.println(FlyerightFactory.getNoReceipt());
	}

}
