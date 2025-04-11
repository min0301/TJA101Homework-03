package hw5;

import java.util.Scanner;

public class Hw51 {
	
	private void starSquare(int width, int height) {
		for(int i = 0 ; i < height ; i++) {
			for(int j = 0 ; j < width ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}



	public static void main(String[] Args) {
		
		Hw51 square = new Hw51();
		System.out.println("請輸入長方形的寬 高 用空白或逗號區隔");
		
		try(Scanner sc = new Scanner(System.in)){
			do {
				//把輸入放入字串中 並用空白區隔
				String[] squareWH = sc.nextLine().split(" |,");

				try {
					//如果輸入的陣列長度是2執行
					if(squareWH.length == 2) {
						int width = Integer.parseInt(squareWH[0]);
						int height = Integer.parseInt(squareWH[1]);
						square.starSquare(width,height);
						break;
						//輸入不為兩個數字 拋出錯誤
					}else {
						throw new IllegalArgumentException("請輸入兩個數字");
			        }
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("請重新輸入正確數字");
				}
			} while (true);
			
		}
		
	}
	
}
