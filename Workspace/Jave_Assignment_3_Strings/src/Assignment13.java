
public class Assignment13 {
	public static void main(String[] args) {
		System.out.println(are_anagrams("taco", "cat"));
	}
	
	public static boolean are_anagrams(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		if (str1.equals(str2)) {
			return false;
		}
		int[] present = new int[str1.length()];
		for(int i = 0; i < str1.length(); i++) {
			present[i] = -1;
		}
		for(int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			int idx = str2.indexOf(c);
			do {
				if (idx == -1) {
					return false;
				}
				if (present[idx] == -1) {
					present[idx] = i;
					break;
				} else {
					idx = str2.indexOf(c, idx + 1);
				}
			} while (true);
		}
		return true;
	}
}
