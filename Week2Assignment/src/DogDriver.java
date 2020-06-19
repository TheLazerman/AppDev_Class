
public class DogDriver {
	
	public static void main(String[] args) {
		
		//Gus is a normal dog who's a bit shy
		Dog gus = new Dog(2, "Gus", "male", "timid");
		
		//Spot will destroy us all
		RobotDog spot = new RobotDog(200, "Spot", "female", "robotic");
		
		//Günter is a crazy puppy
		Spaniel günter = new Spaniel(1, "Günter", "female", "crazy");
		
		System.out.println("Gus, speak.");
		gus.bark();
		
		System.out.println("Spot, sit.");
		spot.sit();
		System.out.println("Spot, speak.");
		spot.bark();
		

		System.out.println("Günter, sit.");
		günter.sit();
		System.out.println("Günter, speak.");
		günter.bark();
		
	}
}