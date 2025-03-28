package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw31 {
	public static void main(String[] args) {
		
		Hw31 a =new Hw31();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入三角形第一個邊長");
		while (!sc.hasNextInt()) {
			System.out.println("輸入不為正整數 請重新輸入");
			sc.next();
		}
		int data1 = sc.nextInt();
		
		System.out.println("請輸入三角形第二個邊長");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("輸入不為正整數 請重新輸入");
		}
		int data2 = sc.nextInt();
		
		System.out.println("請輸入三角形第三個邊長");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("輸入不為正整數 請重新輸入");
		}
		
		int data3 = sc.nextInt();
		
		int[] sideLength = {data1,data2,data3};
		a.Triangle(sideLength);
		sc.close();
		
	}

	public void Triangle(int sl[]) {
		Arrays.sort(sl);
		if(sl[0] <= 0) {
			System.out.println("不是三角形");
		}else if(sl[0] == sl[1] && sl[0] == sl[2]){
			System.out.println("正三角形");
		}else if((Math.pow(sl[0], 2)+ Math.pow(sl[1], 2)) == Math.pow(sl[2], 2)){
			System.out.println("直角三角形");
		}else if(sl[0] != sl[1] && sl[0] != sl[2]) {
			System.out.println("其他三角形");
		}
		else {
			System.out.println("等腰三角形");
		}
	}
}
