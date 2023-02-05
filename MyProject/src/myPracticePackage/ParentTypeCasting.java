package myPracticePackage;
class Parent{
	int x=10;
	void show() {
		System.out.println("parent-show");
		
	}
	void OnlyParentShow() {
		System.out.println("Only Parent show");
		
	}
}
class Child extends Parent{
	int x=20;
	void show() {
		System.out.println("child-show");
	}
	    void OnlyChildShow() {
    	System.out.println("Only child show");
    }
	}
public class ParentTypeCasting {
public static void main(String [] args)
{   Parent p=new Child();
	//Child p=new Child();
  p.show();
  p.OnlyParentShow();
  System.out.println(p.x);
}

}
