
public class Bird extends Pet{
	
	public Bird(String diet, boolean isNight, boolean havePoison, boolean flies)
	{
		super(diet, isNight, havePoison, flies);
	}
	
	// sound method for Bird
	@Override
	public void sound()
	{
		System.out.println("Chirp!");
	}
	
	// move method for Bird
	@Override
	public void move()
	{
		System.out.println("Flying in the sky");
	}
	
	
	// toString method for Birds
	@Override
	public String toString()
	{
		return "Bird\n" + 
				"{\n" + 
				"diet = " + getDiet() +"\n" +
				"isNight = " + getIsNight() + "\n" +
				"havePoison = " + getHavePoison() + "\n" +
				"flies = " + getFlies() + "\n"+
				"}";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b1 = new Bird("Omnivore", false, false, true);
		System.out.println(b1.toString());
		b1.move();
		b1.sound();
	

}

}
