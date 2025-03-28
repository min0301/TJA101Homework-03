package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw31 {
	public static void main(String[] args) {
		
		
		Hw31 a =new Hw31();
		
		System.out.println("請輸入數字 用空格區隔");
		Scanner sc = new Scanner(System.in);
		
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
		int[] b = {data1,data2,data3};
		a.Triangle(b);
		
	}

	public void Triangle(int c[]) {
		Arrays.sort(c);
		if(c[0] == 0) {
			System.out.println("不是三角形");
		}else if(c[0] == c[1] && c[0] == c[2]){
			System.out.println("正三角形");
		}else if((Math.pow(c[0], 2)+ Math.pow(c[1], 2)) == Math.pow(c[2], 2)){
			System.out.println("直角三角形");
		}else if(c[0] != c[1] && c[0] != c[2]) {
			System.out.println("其他三角形");
		}
		else {
			System.out.println("等腰三角形");
		}
	}
}
