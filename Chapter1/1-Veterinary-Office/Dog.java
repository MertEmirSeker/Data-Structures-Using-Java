
public class Dog extends Pet {
	
	// Constructor
	public Dog(String diet, boolean isNight, boolean havePoison, boolean flies)
	{
		super(diet, isNight, havePoison, flies);
	}
	
	// sound method for Dog
	@Override
	public void sound()
	{
		System.out.println("Woof");
	}
	
	// move method for Dog
	@Override
	public void move()
	{
		System.out.println("Running on four legs");
	}
	
	
	// toString method for Dog
	@Override
	public String toString()
	{
		return "Dog\n" + 
				"{\n" + 
				"diet = " + getDiet() +"\n" +
				"isNight = " + getIsNight() + "\n" +
				"havePoison = " + getHavePoison() + "\n" +
				"flies = " + getFlies() + "\n"+
				"}";
	}
	
	
	
	// main method
	public static void main(String [] args)
	{
		Dog d1 = new Dog("Omnivore", false, false, false);
		System.out.println(d1.toString());
		d1.move();
		d1.sound();
	}
	
}
