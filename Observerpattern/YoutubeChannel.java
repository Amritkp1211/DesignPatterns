package Observerpattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

	List<Observer> subscriber = new ArrayList<>();

	@Override
	public void subscribe(Observer ob) {
		this.subscriber.add(ob);
	}

	@Override
	public void unsubscribe(Observer ob) {

		this.subscriber.remove(0);
	}

	@Override
	public void notifyChnages(String message) {

		for (Observer ob : this.subscriber) {
			ob.notified(message);
		}
	}
	

}
