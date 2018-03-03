package model;

public class ReallyAwesomePerson extends AwesomePerson {
	public ReallyAwesomePerson() {
		System.out.println("Constructing ReallyAwesomePerson");
	}
	public void talk() {
		System.out.println("HELLO! I AM " + name + " AND I AM SUPER AWESOME!!!!");
	}

}
