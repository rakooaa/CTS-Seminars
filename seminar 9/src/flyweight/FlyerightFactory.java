package flyweight;

import java.util.HashMap;
import java.util.ListResourceBundle;
import java.util.Map;

public class FlyerightFactory {
	private static Map<EnumReceipt, Receipt> liatReceipt=new HashMap<EnumReceipt, Receipt>();
	public static Receipt getReceipt(EnumReceipt type) {
		Receipt rec=new Receipt(type);
		liatReceipt.put(type, rec);
//		switch (type) {
//		case type:{
//			//yeld type
//		}default:
//			throw new IllegalArgumentException("Unexpected value: "+ type);
//		}
		return rec;
	}
	
	public static int getNoReceipt() {
		return liatReceipt.size();
	}
}
