package two;

public class Application {

	public static void main(String[] args) {
		PrivatePerson pp = new PrivatePerson();
		pp.setAge(10);
		pp.setName("privatino");
		System.out.println(pp.getAge() + pp.getName());

	}

}
