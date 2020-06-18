
public class Spaniel extends Dog{

	public Spaniel(int age, String name, String gender, String personality) {
		super(age, name, gender, personality);
		// TODO Auto-generated constructor stub
	}

	
	//Override Methods
	public void sit() {
		System.out.println(" spins in a circle and sits down.");		
	}
	
	public void bark() {
		System.out.println("Bark!!");
	}	
}
