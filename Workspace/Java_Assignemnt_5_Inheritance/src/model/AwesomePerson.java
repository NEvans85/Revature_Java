package model;

public class AwesomePerson extends Person {
	public AwesomePerson() {
		age = 99;
		name = "Awesomeo";
		System.out.println("Constructing AwesomePerson");
	}
	public void talk() {
		System.out.println("Hello my name is " + name + " and I am " + age + " years old!");
	}
}
