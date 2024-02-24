
public class Notebook extends Computer
{
    private double processorPrice;
    private double memoryPrice;
    private double diskDrivePrice;
    private double cdDrivePrice;
    private double dvdDrivePrice;
    private double screenSizePrice;
    
    // constructor
    Notebook(double basePrice, double processorPrice, double memoryPrice, double diskDrivePrice, double cdDrivePrice, double dvdDrivePrice, double screenSizePrice)
    {
    	super(basePrice);
    	this.processorPrice = processorPrice;
    	this.memoryPrice = memoryPrice;
    	this.diskDrivePrice = diskDrivePrice;
    	this.cdDrivePrice = cdDrivePrice;
    	this.dvdDrivePrice = dvdDrivePrice;
    	this.screenSizePrice = screenSizePrice;
    }
    
    // Price calculating method
    @Override
    public double calculatePrice()
    {
    	return basePrice + processorPrice + memoryPrice + diskDrivePrice + cdDrivePrice + dvdDrivePrice + screenSizePrice;
    }
    
    // Shipping cost calculating method
    @Override
    public double calculateShippingCost()
    {
    	return 30.0; // constant value for shipping cost
    }
}
