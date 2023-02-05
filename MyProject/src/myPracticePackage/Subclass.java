package myPracticePackage;
class parentClass{
	int num=100;
	parentClass()
	{
		System.out.println("This is parent class");
}
	parentClass(String str)
	{
		System.out.println("This is parent1 class");
}
}
public class Subclass extends parentClass{
    Subclass(){
    	  super("kmfls");
    	
    		System.out.println("This is child class");
    		
    }
    
    Subclass(int n){System.out.println("This is child class parameterized");}
    
    
	public static void main(String[] args) {
		
Subclass sub=new Subclass();
Subclass sub1=new Subclass(10);

	}

}
