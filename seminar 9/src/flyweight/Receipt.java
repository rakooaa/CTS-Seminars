package flyweight;

public class Receipt implements IReceipt{

	private static EnumReceipt receiptType;
	
	

	public Receipt(EnumReceipt receiptType) {
		super();
		this.receiptType = receiptType;
	}

	public static EnumReceipt getReceiptType() {
		return receiptType;
	}
	
	@Override
	public void printReceipt(ReceiptData data) {
		System.out.println("this rec is "+ this.receiptType + data.getPrice());
	}

}
