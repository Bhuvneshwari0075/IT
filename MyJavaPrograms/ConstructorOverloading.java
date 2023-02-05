
public class ConstructorOverloading {

	 int var;
    //default constructor
   ConstructorOverloading()
    {
           this.var = 10;
    }
    //parameterized constructor
     ConstructorOverloading(int num)
    {
           this.var = num;
    }
    int getValue()
    {
            return var;
    }
    public static void main(String args[])
    {
    	ConstructorOverloading obj = new ConstructorOverloading();
    	ConstructorOverloading obj2 = new ConstructorOverloading(100);
            System.out.println("var is: "+obj.getValue());
            System.out.println("var is: "+obj2.getValue());
    }
}
