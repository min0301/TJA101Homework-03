package hw3;

import java.util.Scanner;

public class Hw32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*猜數字小遊戲*");
		System.out.print("請輸入最小數字：");
		int min = sc.nextInt();
		System.out.print("請輸入最大數字：");	
		int max = sc.nextInt();
		
		//產生區間內隨機數字
		int data = (int)(Math.random() * (max - min + 1)) + min;

		//	確認答案
		//	System.out.println(data);
		
		//	猜答案
		while(true) {
			System.out.print("請猜一 "+ min + " ~ " + max + " 間的數字：");	
			int x = sc.nextInt();
			if (x == data) {
				System.out.println("恭喜猜對了！");
				break;
			}else if(x > data){
				System.out.println("哇～猜錯了 (答案比" + x + "小唷)");
				System.out.println();
				continue;
			}else {
				System.out.println("哇～猜錯了 (答案比" + x + "大唷)");
				System.out.println();
				continue;
			}
		}
		//關閉scanner
		sc.close();
	}
}
