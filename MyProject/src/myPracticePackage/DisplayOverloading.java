
//When number of arguments are different.
package myPracticePackage;

 class DispOverloading {
	public void disp(char c)
	{System.out.println(c);
	
	}
	
	public void disp(int num,char c)
	{System.out.println(c+" "+num);
	}
	
	public void disp(int c)
	{System.out.println(c);
	
}
	public void disp2(int a,float b)
	{System.out.println("Method disp2"+a+" "+b);
	}
	public void disp2(int a,double b,double c)
	{System.out.println("Method disp2 "+a+" "+b+" "+c);
 }	
 }
public class DisplayOverloading {

	public static void main(String[] args) {
		DispOverloading obj=new DispOverloading();
		obj.disp('a');
		obj.disp(90,'f');
		obj.disp(89);
		obj.disp('d');
		obj.disp2(67, 70.90f);
		obj.disp2(34,7,90);
		

	}

}
