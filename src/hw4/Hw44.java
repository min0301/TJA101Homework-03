package hw4;

import java.util.Scanner;

public class Hw44 {
	public static void main(String[] args) {
		
		int[][] emp = new int[2][5];
		emp[0][0]=25;	emp[1][0]=2500;
		emp[0][1]=32;	emp[1][1]=800;	
		emp[0][2]=8;	emp[1][2]=500;
		emp[0][3]=19;	emp[1][3]=1000;
		emp[0][4]=27;	emp[1][4]=1200;
		
		System.out.print("阿文要借多少：");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		sc.close();
		int sum = 0;
		for (int i = 0 ; i < emp[0].length ; i++) {
			if(emp[1][i] >= money) {
				System.out.print(emp[0][i] + " ");
				sum++;
			}
		}
		System.out.print("共 " + sum + " 人可以借！");
		
		System.out.println(money);
		

	}
}
