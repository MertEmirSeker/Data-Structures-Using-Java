
public class Snake extends Pet {
	// Constructor
	public Snake(String diet, boolean isNight, boolean havePoison, boolean flies)
	{
		super(diet, isNight, havePoison, flies);
	}
	
	// sound method for Snake
	@Override
	public void sound()
	{
		System.out.println("Hiss!");
	}
	
	// move method for Snake
	@Override
	public void move()
	{
		System.out.println("Slithering on the ground");
	}
	
	
	// toString method for Snake
	@Override
	public String toString()
	{
		return "Snake\n" + 
				"{\n" + 
				"diet = " + getDiet() +"\n" +
				"isNight = " + getIsNight() + "\n" +
				"havePoison = " + getHavePoison() + "\n" +
				"flies = " + getFlies() + "\n"+
				"}";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake s1 = new Snake("Carnivore", true, true, false);
		System.out.println(s1.toString());
		s1.move();
		s1.sound();
	

} 
	
}
