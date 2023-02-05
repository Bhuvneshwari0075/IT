//Use of super() meyhod to invoke parent class constructor. 
package myPracticePackage;
class shape{
	int length,breadth;
	shape(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
}
class cuboids extends shape{
int height;
int length1=super.length;
int breadth1=super.breadth;

  cuboids(int height)
  { super(10,20);
	 this.height=height;
	}
 public int Volume() {
	 int result=length1*breadth1*height;
	 return result ;
 }
}

public class Shape1 {
	public static void main(String[]args) {
		
		cuboids c=new cuboids(30);
		System.out.println(c.Volume());
	}

}

