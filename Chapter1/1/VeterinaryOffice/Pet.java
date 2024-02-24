
public abstract class Pet {
	
	private String diet;
	private boolean isNight;
	private boolean havePoison;
	private boolean flies;
	
	
	public abstract void sound();
	public abstract void move();
	
	
	// constructor
	public Pet(String diet, boolean isNight, boolean havePoison, boolean flies)
	{
		this.diet = diet;
		this.isNight = isNight;
		this.havePoison = havePoison;
		this.flies = flies;
	}
	
	
	// getter methods
	public String getDiet()
	{
		return diet;
	}

	public boolean getIsNight()
	{
		return isNight;
	}
	
	public boolean getHavePoison()
	{
		return havePoison;
	}
	
	public boolean getFlies() {
		return flies;
	}
	

	// setter methods
	public void setDiet(String diet)
	{
		this.diet = diet;
	}
	
	public void setIsNight(boolean isNight)
	{
		this.isNight = isNight;
	}
	
	public void setHavePoison(boolean havePoison)
	{
		this.havePoison = havePoison;
	}
	
	
	public void setFlies(boolean flies)
	{
		this.flies = flies;
	}
	
	
	
	// toString method
	@Override
	public String toString()
	{
		return "Pet\n" + 
				"{\n" + 
				"diet = " + diet +"\n" +
				"isNight = " + isNight + "\n" +
				"havePoison = " + havePoison + "\n" +
				"flies = " + flies + "\n"+
				"}";
	}
	
	
	
}
