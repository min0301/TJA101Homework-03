package hw5;

import java.util.Random;
import java.util.Scanner;

public class Hw52 {
	
	
	public void randAvg(int count ,int start, int end) {
		
		Random random = new Random();
		int[] randAvg = new int[count];
		
		//得到指定範圍隨機數
		for(int i = 0 ; i < count ; i++) {
			int random1 = (random.nextInt(end - start + 1)) + start;
			randAvg[i] = random1;
		}
		
		double sum = 0;
		System.out.print("隨機數字為：");
		for (int i : randAvg) {
			System.out.print(i + "\t");
			sum = sum + i ;
		}
		System.out.println();
		double avg = (sum / count);
		System.out.println("平均值為： " + avg);
		
	}
	
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			int count;
			do {
				System.out.print("請輸入想得到幾個隨機正整數： ");
				// 用空格或逗號分隔
				String[] countString = sc.nextLine().split(" |,");
				count = Integer.parseInt(countString[0]); 
				if(countString.length == 1) {
					break;
				} else{
				throw new IllegalArgumentException("請確認輸入格式");
				}
			}
			while (true);

			
			//如果上面是得到nextInt的話就需要清除換行殘留
//			sc.nextLine(); 

			do {
				System.out.print("請輸入數字範圍(以空白或逗號做區隔)： ");
				String Range[] = sc.nextLine().split(" |,");
				int startRange = Integer.parseInt(Range[0]);
				int endRange = Integer.parseInt(Range[1]);				
				if(Range.length == 2 && startRange < endRange) {
					Hw52 randAvg = new Hw52();
					randAvg.randAvg(count,startRange,endRange);
					break;
				}else{
					System.out.println("請重新輸入範圍");
				};
			} while (true);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("輸入格式錯誤");
		}

		
	}

}
