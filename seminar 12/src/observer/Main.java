package observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event event=new Event();
		ISubscriber Larisa=new SubscriberA();
		ISubscriber Mierela=new SubscriberB();
		
		event.addObserver(Larisa);
		event.addObserver(Mierela);
		
		event.publicateEvent();
	}

}
