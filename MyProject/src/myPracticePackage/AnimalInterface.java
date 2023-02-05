package myPracticePackage;

 interface AnimalInterface12 {
	
	void myname();
	void sleep(); 

}
class DogA implements AnimalInterface12{
	
	public void myname() {
		System.out.println("I am Dog");
	}
	public void sleep() {
		System.out.println("Dog is sleeping.");
		
	
}
}
class AnimalInterface{
	public static void main(String args[])
	{ DogA d=new DogA();
	   d.myname();
	d.sleep();
	}
}
