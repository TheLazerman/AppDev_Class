
public class Spaniel extends Dog{

	public Spaniel(int age, String name, String gender, String personality) {
		super(age, name, gender, personality);
		// TODO Auto-generated constructor stub
	}

	
	//Override Methods
	public void sit() {
		String name = getName();
		System.out.println(name + " spins in a circle and sits down.");		
	}
	
	public void bark() {
		System.out.println("Ruff!!");
	}	
}
