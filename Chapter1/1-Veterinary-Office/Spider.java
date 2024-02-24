
public class Spider extends Pet{

	public Spider(String diet, boolean isNight, boolean havePoison, boolean flies)
	{
		super(diet, isNight, havePoison, flies);
	}
	
	// sound method for Spider
	@Override
	public void sound()
	{
		System.out.println("...");
	}
	
	// move method for Spider
	@Override
	public void move()
	{
		System.out.println("Crawling on the ground.");
	}
	
	
	// toString method for Spider
	@Override
	public String toString()
	{
		return "Spider\n" + 
				"{\n" + 
				"diet = " + getDiet() +"\n" +
				"isNight = " + getIsNight() + "\n" +
				"havePoison = " + getHavePoison() + "\n" +
				"flies = " + getFlies() + "\n"+
				"}";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spider s1 = new Spider("Insectivore", true, false, false);
		System.out.println(s1.toString());
		s1.move();
		s1.sound();
	

}
	
}
