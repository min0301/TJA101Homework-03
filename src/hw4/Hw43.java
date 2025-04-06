package hw4;

public class Hw43 {

	public static void main(String[] args) {
		String[] x ={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (String j : x) {
			for (char k : j.toCharArray() ) {
				switch(k) {
				case 'a':
					a = a + 1;
					break;
				case 'e':
					e = e + 1;
					break;
				case 'i':
					i = i + 1;
					break;
				case 'o':
					o = o + 1;
					break;
				case 'u':
					u = u + 1;
					break;
				}
			}
		}
		
		System.out.println("a 的數量 = " + a);
		System.out.println("e 的數量 = " + e);
		System.out.println("i 的數量 = " + i);
		System.out.println("o 的數量 = " + o);
		System.out.println("u 的數量 = " + u);
		
	}
}