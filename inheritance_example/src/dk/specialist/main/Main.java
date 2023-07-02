package dk.specialist.main;

import dk.specialist.objects.Human3;

public class Main {
	public static void main(String[] args) {
//		Example inheritance of three objects, inheriting  from each other.
//		human3 inherit from human2.
//		human2 inherit from human1
//		human1 is the first human
		Human3 human3 = new Human3();
		
//		This is the default human health value of 100, defined in human1.
		System.out.println("Health before: " + human3.getHealth());
		
//		This is the new human value set in human3, not inherited by human2 nor human1.
		human3.setHealth(110);
		System.out.println("Health after: " + human3.getHealth());
		
//		The keyword 'extends' in human2 and human3 classes, are the keyword that allow inheritance.
	}
}
