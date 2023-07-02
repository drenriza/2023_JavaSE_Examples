package dk.specialist.main;

class Human1 {
	protected int health = 100;
	
	public Human1() {
		int health = this.health;
	}
}

class Human2 extends Human1 {
	public Human2() {
		super();
	}
	
	public int getHealth() {
		return this.health;
	}
}

class Human3 extends Human2 {
	public Human3() {
		super();
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
}

public class Main {
	//	Inheritance in Java allows a class to inherit properties and behaviors (methods) from another
	//	class. The class that inherits is called a subclass, and the class being inherited from is called
	//	a superclass.
	
	//	By inheriting from a superclass, the subclass gains access to its fields and methods.
	//	This promotes code reuse and allows for specialization, as the subclass can add its own unique
	//	features while still retaining the characteristics of the superclass.
	
	//	Inheritance is achieved using the extends keyword in Java. It establishes a parent-child relationship
	//	between classes, enabling the subclass to inherit and extend the functionality of the superclass.
	
	//	Overall, inheritance is a fundamental mechanism in Java that facilitates code organization, promotes
	//	reusability, and supports the concept of object-oriented programming.
	
	public static void main(String[] args) {
		//	Example: Inheritance where a value of 'health' is inherited down two times from human1 to human3.

		//	human3 inherit from human2. (Allows to set a new health)
		//	human2 inherit from human1. (Allows to get the health)
		//	human1 is the first human.	(Sets the initial health)
		//		The protected value in human1, makes the value available package wide.
		Human3 human3 = new Human3();
		
		//	This is the default human health value of 100, defined in human1.
		System.out.println("Health before: " + human3.getHealth());
		
		//	This is the new human value set in human3, not inherited by human2 nor human1.
		human3.setHealth(110);
		System.out.println("Health after: " + human3.getHealth());
		
		//	The keyword 'extends' in human2 and human3 classes, are the keyword that allow inheritance.
	}
}
