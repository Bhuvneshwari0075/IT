package myPracticePackage;

public class Cat extends Animal{
	public Cat(String color,double weight)
	{super(color,weight);
	
	}
	@Override
	public void speak()
	{
	System.out.println("I am a cat");
}	
}
