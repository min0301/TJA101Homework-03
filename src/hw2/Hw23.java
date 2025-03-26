package hw2;

public class Hw23 {
	public static void main(String[] args) {
		int initialValue = 1;
		int targetValue = 10;
		int sum = initialValue;
		int i = 1;
		while(i <= targetValue){
			sum =i * sum;
			i++;
		}
		System.out.println(initialValue + " 到 " +targetValue + " 的連乘積 = " + sum);
	}
}
