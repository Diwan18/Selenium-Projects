package config;

public class Encapsulation {

	private int cardPin=3675;

	public int getCardPin() {
		return cardPin;
	}

	public void setCardPin(int cardPin) {
		this.cardPin = cardPin;
		
		System.out.println(cardPin);
	}
	
}
