
public class Frog extends Pet {
	
	public Frog(String diet, boolean isNight, boolean havePoison, boolean flies)
	{
		super(diet, isNight, havePoison, flies);
	}
	
	// sound method for Frog
	@Override
	public void sound()
	{
		System.out.println("Croak");
	}
	
	// move method for Frog
	@Override
	public void move()
	{
		System.out.println("Hopping and swimming");
	}
	
	
	// toString method for Frog
	@Override
	public String toString()
	{
		return "Frog\n" + 
				"{\n" + 
				"diet = " + getDiet() +"\n" +
				"isNight = " + getIsNight() + "\n" +
				"havePoison = " + getHavePoison() + "\n" +
				"flies = " + getFlies() + "\n"+
				"}";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog f1 = new Frog("Insectivore", true, false, false);
		System.out.println(f1.toString());
		f1.move();
		f1.sound();
	

}

}
