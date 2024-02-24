
public class Lizard extends Pet {
	
	public Lizard(String diet, boolean isNight, boolean havePoison, boolean flies)
	{
		super(diet, isNight, havePoison, flies);
	}
	
	// sound method for Lizard
	@Override
	public void sound()
	{
		System.out.println("Hiss!");
	}
	
	// move method for Lizard
	@Override
	public void move()
	{
		System.out.println("Crawling and climbing.");
	}
	
	
	// toString method for Lizard
	@Override
	public String toString()
	{
		return "Lizard\n" + 
				"{\n" + 
				"diet = " + getDiet() +"\n" +
				"isNight = " + getIsNight() + "\n" +
				"havePoison = " + getHavePoison() + "\n" +
				"flies = " + getFlies() + "\n"+
				"}";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lizard l1 = new Lizard("Insectivore", true, false, false);
		System.out.println(l1.toString());
		l1.move();
		l1.sound();
	

}

}
