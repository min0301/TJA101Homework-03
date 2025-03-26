package hw1;

public class Hw13 {
	
	public static void main(String[] args) {
		int allSecond = 256559;
		int daySecond = 60*60*24;
		int hourSecond = 60*60;
		int minuteSecond = 60;
		int day = allSecond / daySecond;
//		System.out.println(day);	//檢查天數
		int hour = (allSecond % daySecond) / hourSecond ;
//		System.out.println(hour);	//檢查小時數
		int minute = ((allSecond % daySecond) % hourSecond) / minuteSecond ;
//		System.out.println(minute);	//檢查分數
		int second = allSecond-(day * daySecond)-(hour * hourSecond)-(minute * minuteSecond);
//		System.out.println(second);	//檢查秒數
		System.out.println(allSecond+" 秒 = "+day+" 天 "+hour+ " 小時 "+minute+" 分 "+second+" 秒");
	}
	
}
