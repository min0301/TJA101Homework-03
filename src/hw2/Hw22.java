package hw2;

public class Hw22 {
	public static void main(String[] args) {
		int initialValue = 1;
		int targetValue = 10;
		int sum = initialValue;
		
	for(int i = 1; i <= targetValue; i++) {
		sum= i * sum;
		}
	System.out.println(initialValue + " 到 " +targetValue + " 的連乘積 = " + sum);
	}
}
