//Constructor Overloading

public class Example1 {
int num;
String name;
Example1(int n,String name1)
{num=n;
name=name1;
}
Example1(int n1)
{this.num=n1;
}


public static void main(String[] args)
{ 
	Example1 obj1=new Example1(10,"hi");
	Example1 obj2=new Example1(20);
	
	System.out.println(obj1.num+" "+obj1.name);
	System.out.println(obj2.num);
	
	
}


}
