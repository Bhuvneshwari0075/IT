public class StaticVarExample {
 private String myClassVar="class or static variable";
 
 
	public static void main(String[] args) {
		
		StaticVarExample obj1=new StaticVarExample();
		StaticVarExample1 obj2=new StaticVarExample1();
		StaticVarExample obj3=new StaticVarExample();
		
		System.out.println(obj1.myClassVar);
		//System.out.println(obj2.myClassVar1);
		System.out.println(obj3.myClassVar);
		
		
		//obj2.myClassVar="I have changed it to my name";
		
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.mymethod());
		System.out.println(obj3.myClassVar);
		
			
		
	}

}
class StaticVarExample1{
	private String myClassVar1="lkjk";
	
	public String mymethod()
	{ return myClassVar1;
	}
	}
