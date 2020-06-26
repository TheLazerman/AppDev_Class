package catProject;

public class Cat {

	
	//member variables
	private String name = "";
	private String gender = "";
	private int age = 0;
	private boolean isAMouser = false;
	private int weight = 0;
	
	public Cat(String name, String gender, int age, boolean isAMouser, int weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isAMouser = isAMouser;
		this.weight = weight;
	}

	
	
	//Getters
	public Object getName() {
		return this.name;
	}
	public Integer getAge() {
		return this.age;
	}
	public Object getGender() {
		return this.gender;
	}	
	public Object getIsAMouser() {
		return this.isAMouser;
	}	
	public Object getWeight() {
		return this.weight;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;		
	}
	public void setAge(int age) {
		this.age = age;		
	}
	public void setGender(String gender) {
		this.gender = gender;		
	}
	public void setMouser(boolean mouser) {
		this.isAMouser = mouser;		
	}
	public void setWeight(int weight) {
		this.weight = weight;		
	}
	
	//methods
	public void meow(int meowCount) {
		for(int i=0; i<meowCount; i++) {
			System.out.println("Meow ");
		}
	}

}
