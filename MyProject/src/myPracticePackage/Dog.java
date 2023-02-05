package myPracticePackage;

public class Dog extends Animal {
	public Dog(String color,double weight)
	{super(color,weight);
	}
	@Override  //to tell the compiler that we ARE overriding the  method of parent class
	public void speak()
	{
	System.out.println("I am a dog");
}	
	

}
