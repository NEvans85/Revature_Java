package four;

public class ConstructorPerson {
	private String name;
	private int age;
	
	public ConstructorPerson() {
		age = 0;
		name = "defaulto";
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
