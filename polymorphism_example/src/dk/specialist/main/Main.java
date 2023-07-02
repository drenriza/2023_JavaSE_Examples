package dk.specialist.main;

class Bird {
	public void sing() {
		System.out.println("Birds go Tweet Tweet Tweet");
	}
}

class Ducks extends Bird {
	@Override
	public void sing() {
		System.out.println("Ducks say sounds");
	}
}

class Geese extends Bird {
	
}

public class Main {
	//	Polymorphism = Many forms of a method.
	
	// ---------------------------------------------------------------------------------------------------	
	//	Polymorphism is a fundamental concept in object-oriented programming, including the Java language.
	//	It refers to the ability of an object to take on many forms or types. In Java,
	//	polymorphism allows objects of different classes that are related by inheritance to be
	//	treated as objects of a common superclass.
	
	//	There are two main types of polymorphism in Java
	// ---------------------------------------------------------------------------------------------------
			
	//	1) Compile-time Polymorphism (also known as method Overloading)
	//	This type of polymorphism is achieved by having multiple methods with the same name but different
	//	parameter lists within the same class. The appropriate method to execute is determined at compile
	//	time based on the number, type, and order of the arguments passed to the method.
	public int add(int a, int b) {
		return (a + b);
	}
	
	public double add (double a, double b) {
		return (a + b);
	}
	
	//	In the above example, the add method is overloaded with two versions: one that accepts
	//	integers and another that accepts doubles. The appropriate version is called based on
	//	the argument types.
	
	//	2) Runtime Polymorphism (also known as Method Overriding)
	//	This type of polymorphism is achieved by having a subclass provide its own implementation of a method that is already
	//	defined in its superclass. The method in the subclass should have the same name, return type, and parameter list as
	//	the method in the superclass.
	
	//	class Bird {
	//		public void sing() {
	//			System.out.println("Tweet Tweet Tweet");
	//		}
	//	}
	
	//	class Ducks extends Bird {
	//		@Override
	//		public void sing() {
	//			System.out.println("Ducks say sounds");
	//		}
	//	}
	
	//	class Geese extends Bird {
	//		
	//	}
	
	// Ending
	// ------
	//	Polymorphism allows for code reusability, flexibility, and the ability to write more generic code that can work with
	//	objects of different types. It is a key aspect of object-oriented programming and facilitates the design of modular
	//	and extensible systems.
	
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println("1) Compile-time Polymorphism");
		System.out.println("----------------------------");
		System.out.println(m.add(12, 5));
		System.out.println(m.add(12.2, 0.8));
		
		System.out.println("");
		
		System.out.println("2) Runtime Polymorphism");
		System.out.println("-----------------------");
		Bird b = new Bird();
		b.sing();
		
		Ducks d = new Ducks();
		d.sing();
		
		Geese g = new Geese();
		g.sing();
	}
}