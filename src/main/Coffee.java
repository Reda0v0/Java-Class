package main;

public class Coffee {
	private String type; // (Espresso - Cappuccino - Latte)
	private boolean isDecaf;
	private double price;
	private String blend; // (Arabica - Robusta - Columbian)
	private boolean isGrounded;
	
	public Coffee() {}

	public Coffee(String type, boolean isDecaf, double price, String blend, boolean isGrounded) {
		super();
		this.type = type;
		this.isDecaf = isDecaf;
		this.price = price;
		this.blend = blend;
		this.isGrounded = isGrounded;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isDecaf() {
		return isDecaf;
	}

	public void setDecaf(boolean isDecaf) {
		this.isDecaf = isDecaf;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBlend() {
		return blend;
	}

	public void setBlend(String blend) {
		this.blend = blend;
	}

	public boolean isGrounded() {
		return isGrounded;
	}

	public void setGrounded(boolean isGrounded) {
		this.isGrounded = isGrounded;
	}

	@Override
	public String toString() {
		return ">> type=" + type + ", isDecaf=" + isDecaf + ", price=" + price + ", blend=" + blend + ", isGrounded=" + isGrounded;
	}
	
	
}
