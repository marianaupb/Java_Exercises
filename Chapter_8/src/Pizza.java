import java.text.DecimalFormat;

class Pizza {
	private String name;
	private double price;
	
	public Pizza (String name, double price)	{
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String toString()	{
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		return getName() + " (" + twoDecimals.format(getPrice()).replace(".",",") + " euros)";
	}
	
}
