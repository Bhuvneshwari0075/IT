//Parent class which is inherited by dog class,cat class and used in tester class
//showing method overriding
package myPracticePackage;

public class Animal {
String color;
double weight;

public Animal(String color,double weight)//constructor
{this.color=color;
this.weight=weight;
}
public void speak()
{System.out.println("Hello from the animal");
}
public void eat()
{
System.out.println("I am eating");
}
public void eat(String treat)
{System.out.println("I am eating treat: "+ treat);

}
}
