package catProject;

public class britishShorthair extends Cat{
	

	
	
	public britishShorthair(String name, String gender, int age, boolean isAMouser, int weight) {
		super(name, gender, age, isAMouser, weight);
	}	
	
	//methods
	public void meow(int meowCount) {
		for(int i=0; i<meowCount; i++) {
			System.out.println("Meow ");
		}
	}
}