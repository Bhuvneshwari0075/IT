
public class ExampleObject {
 int num;
 String name;
 
 void mymethod(int n,String name1)
 {num=n;
 name=name1;
 }
	public static void main(String[] args) {
	ExampleObject obj1=new ExampleObject();
	ExampleObject obj2=new ExampleObject();
	obj1.mymethod(89,"jhsd");
	obj2.mymethod(78,"drd");
	System.out.println(obj1.num +" "+obj1.name);
	System.out.println(obj2.num+" "+obj2.name);
	}

}
