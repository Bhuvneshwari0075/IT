package myPracticePackage;

public class Tester {

	public static void main(String[] args) {
		Animal animal=new Animal("grey",20);

		animal.eat();
		animal.eat("cookies");
		Animal dog=new Dog("pink",82.9);
		Animal cat=new Cat("black",78.1);
		animal.speak();
		dog.speak();
		cat.speak();
		cat.eat("chocolates");
	}

}
