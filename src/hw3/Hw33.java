package hw3;


import java.util.Scanner;

public class Hw33 {
	public static void main(String[] args) {
		Hw33 a = new Hw33();
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸樂透最小數字 1 ~ 99：");
		int minValue =sc.nextInt();
		System.out.print("請輸樂透最大數字 1 ~ 99：");
		int maxValue =sc.nextInt();
		System.out.print("請輸入你不喜歡的數字 1 ~ 9 ：");
		int dislineNumber =sc.nextInt();


//		System.out.println((maxValue-minValue)/10+1);
		
		int[][] lotto = new int[(maxValue-minValue)/10+3][7];
		int sum = 0;
		int col = 0;
		int row = 0;
	
		for (int i = minValue ; i <= maxValue ;i++) {
			if(i % 10 == dislineNumber || i /10 == dislineNumber) {
				continue;
			}else{
				lotto[col][row] = i;
				sum++;
				row++;
				
				if(row >= 7) {
					row = 0;
					col++;
				}
			}
		}
		
		// 呼叫列印可選號碼方法
		a.printLotto(lotto);
		
		System.out.println("共有 " + sum +" 個數字可選擇");
	}
	
	
	//列印樂透方法
	public void printLotto (int[][] data) {
		System.out.println("===可以選擇的號碼有以下===");
		for(int i = 0 ; i <data.length ; i++) {
			for(int j = 0 ; j < data[i].length ; j++) {
				if(data[i][j] == 0) {
					continue;
				}
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	}
	
	
