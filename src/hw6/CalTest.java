package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		
		
		System.out.println("===X的Y次方計算機===");
		Calculator xy = new Calculator();
		
		int x,y;
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("請輸入X的值：");
			x = sc.nextInt();
			System.out.print("請輸入Y的值：");
			y = sc.nextInt();
			xy.powerXY(x,y);
	
		}catch (Exception e) {
			System.out.println("輸入格式不正確");
		}
	}

}
