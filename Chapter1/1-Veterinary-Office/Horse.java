
public class Horse extends Pet{
	
	public Horse(String diet, boolean isNight, boolean havePoison, boolean flies)
	{
		super(diet, isNight, havePoison, flies);
	}
	
	// sound method for Horse
	@Override
	public void sound()
	{
		System.out.println("Neigh");
	}
	
	// move method for Horse
	@Override
	public void move()
	{
		System.out.println("Galloping on the ground.");
	}
	
	
	// toString method for Horse
	@Override
	public String toString()
	{
		return "Horse\n" + 
				"{\n" + 
				"diet = " + getDiet() +"\n" +
				"isNight = " + getIsNight() + "\n" +
				"havePoison = " + getHavePoison() + "\n" +
				"flies = " + getFlies() + "\n"+
				"}";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h1 = new Horse("Herbivore", false, false, false);
		System.out.println(h1.toString());
		h1.move();
		h1.sound();
	

}

}
