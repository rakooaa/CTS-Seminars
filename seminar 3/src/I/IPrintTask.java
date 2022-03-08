package I;

public interface IPrintTask {
	boolean scan(String content);
	boolean print(String content);
	boolean printFromExternalDevice(String content);
	boolean openClose(boolean state);
	boolean badgeAuth(String content);
	boolean fax(String receiver);
}
