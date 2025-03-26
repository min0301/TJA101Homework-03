package hw2;

public class Hw21 {
	public static void main(String[] args) {
		int initialValue = 0;
		int targetValue = 1000;
		int sum = initialValue;
		
		for(int i=1;i<=targetValue;i++) {
			if(i%2!=0) {
				continue;
			}
			sum = sum + i;
		}
		System.out.println(initialValue + " 到 " + targetValue + " 的偶數和= " + sum);
	}
}
