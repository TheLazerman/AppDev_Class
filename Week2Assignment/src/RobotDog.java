
public class RobotDog extends Dog{

	public RobotDog(int age, String name, String gender, String personality) {
		super(age, name, gender, personality);
		// TODO Auto-generated constructor stub
	}
	
	//Override Methods
	public void sit() {
		String name = getName();
		System.out.println("Before you can finish saying the command, " + name + " sits.");		
	}
	
	public void bark() {
		System.out.println("01000010 01100001 01110010 01101011 00100001");
	}

	
	
	
}
