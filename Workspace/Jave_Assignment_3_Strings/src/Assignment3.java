
public class Assignment3 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		if (s1 == s2) {
			System.out.println("s1 - abc == s2 - abc");
		}
		if (s1.equals(s2)) {
			System.out.println("s1 equals s2");
		}
	}
 }
