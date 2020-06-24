
public class Dog {
	
	//variables
	private int age = 0;   
	private String name = "";
	private String gender = "";
	private String personality = "";
	
	
	//Dog constructor
	public Dog(int age, String name, String gender, String personality) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.personality = personality;
		
	}
	
	//Setters
	public int setAge(int age) {
		this.age = age;
		return age;
	}
	public String setName(String name) {
		this.name = name;
		return name;
	}
	public String setGender(String gender) {
		this.gender = gender;
		return gender;
	}
	public String setPersonality(String personality) {
		this.personality = personality;
		return personality;
	}
	
	
	
	//Getters
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getPersonality() {
		return personality;
	}
	
	
	
	//Methods
	public void bark() {
		System.out.println("Woof!");
	}
	
	public void sit() {
		System.out.println(name + " Sits.");
	}
	
	public void stay() {
		System.out.println(name + " Stays.");
	}
	


}
