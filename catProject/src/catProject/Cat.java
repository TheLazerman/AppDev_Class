package catProject;

public class Cat {

	
	//member variables
	private String name = "";
	private String gender = "";
	private int age = 0;
	
	public Cat(String name, String gender, int age) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Object getName() {
		return this.name;
	}

	public Integer getAge() {
		return this.age;
	}

	public Object getGender() {
		return this.gender;
	}

}
