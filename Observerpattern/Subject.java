package Observerpattern;

interface Subject {

	void subscribe(Observer ob);
	void unsubscribe(Observer ob);
	void notifyChnages(String message);	
}
