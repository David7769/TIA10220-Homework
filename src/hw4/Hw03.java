package hw4;

public class Hw03 {
	public static void main(String[] args) {
		String s[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0; //計數容器
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == 'a' || s[i].charAt(j) == 'e' || s[i].charAt(j) == 'i' || s[i].charAt(j) == 'o'
						|| s[i].charAt(j) == 'u') {
					count++;
				}
			}
		}
		System.out.println("此陣列母音共有" + count + "個");
	}
}