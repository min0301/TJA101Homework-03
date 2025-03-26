package hw1;

public class Hw15 {
	public static void main(String[] args) {
		int money = 1500000;
		double interestRate = 1.02;			//	年利率
		double compoundInterestRate = 1;	//	
		int year = 10;						//	存幾年	
		
		for(;year>=1;year--) {			//計算複利
			compoundInterestRate = compoundInterestRate*interestRate;
		}
//		System.out.println(compoundInterestRate); 		//確認複利公式
		
		double amount = money * compoundInterestRate;	//利息計算		
		System.out.println("年利率："+interestRate+" 存入："+money+" ; "+year+" 年後共可得 "+(int)amount);
		
	}

}
