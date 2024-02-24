
public abstract class Computer
{
	protected double basePrice;
	
	// constructor
	public Computer(double basePrice)
	{
		this.basePrice = basePrice;
	}
	
	public abstract double calculatePrice();
	public abstract double calculateShippingCost();
	
}
