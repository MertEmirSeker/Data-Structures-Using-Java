
public class Fish extends Pet {
	
	public Fish(String diet, boolean isNight, boolean havePoison, boolean flies)
	{
		super(diet, isNight, havePoison, flies);
	}
	
	// sound method for Fish
	@Override
	public void sound()
	{
		System.out.println("...");
	}
	
	// move method for Fish
	@Override
	public void move()
	{
		System.out.println("Swimming in the water");
	}
	
	
	// toString method for Fish
	@Override
	public String toString()
	{
		return "Fish\n" + 
				"{\n" + 
				"diet = " + getDiet() +"\n" +
				"isNight = " + getIsNight() + "\n" +
				"havePoison = " + getHavePoison() + "\n" +
				"flies = " + getFlies() + "\n"+
				"}";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish f1 = new Fish("Omnivore", false, false, false);
		System.out.println(f1.toString());
		f1.move();
		f1.sound();
	

}
}
