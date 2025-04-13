package hw6;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class CalTest {
//	public static void main(String[] args) {
//		
//		
//		System.out.println("===X的Y次方計算機===");
//		Calculator xy = new Calculator();
//		
//		
//		int x,y;
//		try(Scanner sc = new Scanner(System.in)){
//			System.out.print("請輸入X的值：");
//			x = sc.nextInt();
//			System.out.print("請輸入Y的值：");
//			y = sc.nextInt();
//			xy.powerXY(x,y);
//	
//		}catch (Exception e) {
//			System.out.println("輸入格式不正確");
//		}
//	}
	
	
	
	public static void main(String[] args) {
		

		Calculator xy = new Calculator();
		
		try(Scanner sc = new Scanner(System.in)){	
			
			int x , y;
			
			do {
				try{
					System.out.print("請輸入X的值：");
					x = sc.nextInt();
					break;

				}catch (Exception e) {
					System.out.println("輸入格式不正確");
					sc.nextLine();
				}
			} while (true);
			
			
			do {		
				try{
					System.out.print("請輸入Y的值：");
					y = sc.nextInt();
					if(y == x && y == 0) {
						throw new CalException("0 的 0 次方沒有意義！");
					}else if(y < 0) {
						throw new CalException("次方為負數，回傳結果不為整數！");
					}
					break;
					
				}catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			} while (true);
			
			xy.powerXY(x,y);
		}
	
	}

}
