
public class Desktop extends Computer
{
	
    private double processorPrice;
    private double memoryPrice;
    private double diskDrivePrice;
    private double cdDrivePrice;
    private double dvdDrivePrice;
    
    // constructor
    Desktop(double basePrice, double processorPrice, double memoryPrice, double diskDrivePrice, double cdDrivePrice, double dvdDrivePrice)
    {
    	super(basePrice);
    	this.processorPrice = processorPrice;
    	this.memoryPrice = memoryPrice;
    	this.diskDrivePrice = diskDrivePrice;
    	this.cdDrivePrice = cdDrivePrice;
    	this.dvdDrivePrice = dvdDrivePrice;
    }
    
    // Price calculating method
    @Override
    public double calculatePrice()
    {
    	return basePrice + processorPrice + memoryPrice + diskDrivePrice + cdDrivePrice + dvdDrivePrice;
    }
    
    // Shipping cost calculating method
    @Override
    public double calculateShippingCost()
    {
    	return 50.0; // constant value for shipping cost
    }
    
    
}
