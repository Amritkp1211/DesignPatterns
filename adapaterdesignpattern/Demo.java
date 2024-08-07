package adapaterdesignpattern;

public class Demo {
	public static void main(String[] args) {
		System.out.println("program start");

		AppleCharger appleCharger = new AdapterCharger(new ApCharger());

		Iphone iphone = new Iphone(appleCharger);
		iphone.chargeIphone();
		
		
		
	}

}
