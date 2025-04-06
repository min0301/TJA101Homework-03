package hw4;

import java.util.Arrays;

public class Hw41 {

	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int x[]= {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		Arrays.sort(x);
		
		for(int i = 0 ; i < x.length ; i++) {
			sum = x[i]+ sum;
		}
		avg = sum / x.length;
		System.out.println("平均值 = " + avg);
		System.out.print("比平均值大的數字有 :");
		for(int i = 0 ; i < x.length ; i++) {
			if(x[i] > avg) {
				System.out.print(x[i] + " ");
			}
		}
		
		
		
	}
	
}
