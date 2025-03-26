package hw2;

public class Hw27 {
	public static void main(String[] args) {
		char bigA = '\uff21';
		for(int i = 1 ; i <= 6 ; i ++) {
			for(int j = 1 ; j <= i ; j ++) {
			System.out.print(bigA);
			}
			bigA ++;
			System.out.println();
		}
	}
}
