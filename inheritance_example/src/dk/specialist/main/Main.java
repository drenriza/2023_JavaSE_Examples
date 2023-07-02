package dk.specialist.main;

import dk.specialist.objects.Human3;

public class Main {
	public static void main(String[] args) {
//		Example inheritance of three objects, inheriting  from each other.
		Human3 human3 = new Human3();
		System.out.println("Health before: " + human3.getHealth());
		human3.setHealth(110);
		System.out.println("Health after: " + human3.getHealth());
	}
}
