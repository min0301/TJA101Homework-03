package hw4;

import java.util.Scanner;

public class Hw44 {
	public static void main(String[] args) {
		
		int[][] emp = { 
				{ 25, 32, 8, 19, 27 }, 
				{ 2500, 800,500, 1000, 1200 } 
				};
		
		System.out.print("阿文要借多少：");
		try(Scanner sc = new Scanner(System.in)){
		int money = sc.nextInt();
		int sum = 0;
		System.out.print("員工編號: ");
		for (int i = 0 ; i < emp[0].length ; i++) {
			if(emp[1][i] >= money) {
				System.out.print(emp[0][i] + " ");
				sum++;
			}
		}
		System.out.println();
		System.out.print("共 " + sum + " 人有 " + money + " 可借！");
		}
		catch(Exception e) {
			System.out.println("請輸入正確金額！");
		}
	}
}
