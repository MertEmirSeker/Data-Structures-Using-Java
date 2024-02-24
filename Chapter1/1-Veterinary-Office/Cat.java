
public class Cat extends Pet {

	// Constructor
	public Cat(String diet, boolean isNight, boolean havePoison, boolean flies)
	{
		super(diet, isNight, havePoison, flies);
	}
	
	// sound method for Cat
	@Override
	public void sound()
	{
		System.out.println("Meow");
	}
	
	// move method for Cat
	@Override
	public void move()
	{
		System.out.println("Climbing and Running");
	}
	
	
	// toString method for Cat
	@Override
	public String toString()
	{
		return "Cat\n" + 
				"{\n" + 
				"diet = " + getDiet() +"\n" +
				"isNight = " + getIsNight() + "\n" +
				"havePoison = " + getHavePoison() + "\n" +
				"flies = " + getFlies() + "\n"+
				"}";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat("Carnivore", true, false, false);
		System.out.println(c1.toString());
		c1.move();
		c1.sound();
		
		
	
	}

}
