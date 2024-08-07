package Observerpattern;

public class Subscriber implements Observer {

	String name;
	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void notified(String message) {

		System.out.println(" new  notification ==> "+this.name+" "+message);
		
	}

}
