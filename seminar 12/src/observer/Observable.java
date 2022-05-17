package observer;

import java.util.ArrayList;

public class Observable {
	ArrayList<ISubscriber> listObservers=new ArrayList<>();
	
	public void addObserver(ISubscriber subscriber) {
		this.listObservers.add(subscriber);
	}
	public void removeObserver(ISubscriber subscriber) {
		this.listObservers.remove(subscriber);
	}
	public void notifyAllObservers() {
		for(int i=0; i<listObservers.size(); i++)
			listObservers.get(i).act();
	}
}
