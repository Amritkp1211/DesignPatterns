package adapaterdesignpattern;

public class AdapterCharger implements AppleCharger {

	private AndroidCharger androidCharger;

	public AdapterCharger(AndroidCharger androidCharger) {

		this.androidCharger = androidCharger;
	}

	@Override
	public void chargePhone() {

		androidCharger.ChargeAdroidPhone();
		System.out.println("you phone is charging with adapater");
		
	}

}
