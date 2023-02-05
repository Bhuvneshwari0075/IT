//Explicitly specify which default method is to be used.
package myPracticePackage;

interface P1{
	 default void show() {
		System.out.println("Default method of P1 interface");
		}
	 
}
interface P2{
	 default void show() {
		System.out.println("Default method of P2 interface");
}
	 
}
public class MultipleInheritanceInterface implements P1,P2 {
	
	 
	public void show() {
	P1.super.show();/*{
		System.out.println("Default method of P1 interface");
	}*/
	 P2.super.show();/*{
		System.out.println("Default method of P2 interface");
	}
	*/
	
	}
	public static void main(String[] args)
	{ MultipleInheritanceInterface mit=new MultipleInheritanceInterface();
	mit.show();
	}
}
