package hw4;

import java.util.Scanner;

public class Hw45 {
	
	public static void main(String[] args) {
		
		int[] normalYear = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("請輸入西元年：");
			int year = sc.nextInt();
			System.out.print("請輸入月份：");
			int month = sc.nextInt();
			System.out.print("請輸入日期：");
			int day = sc.nextInt();
			
		System.out.print(year + " 年 "  + month + " 月 " + day + " 日");
			if(year % 4 !=0 || year % 100 == 0 && year % 400 !=0 ) {
				if(day > normalYear[month-1]) {
					throw new ArithmeticException();
				}
				System.out.println("是平年");
				for(int i = 0 ; i < month-1 ; i++) {
					day = day + normalYear[i];
				}
			}else {
				if(day > leapYear[month-1]) {
					throw new ArithmeticException();
				}
				System.out.println("是閏年");
				for(int i = 0 ; i < month-1 ; i++) {
					day = day + leapYear[i];
				}
			}
			System.out.println("是 " + year + " 年的第：" + day + " 天");
		} catch (Exception e) {
			System.out.println("輸入日期有誤");
		}
	}
}
