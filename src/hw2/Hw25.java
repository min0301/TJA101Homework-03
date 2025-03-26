package hw2;

public class Hw25 {
	public static void main(String[] args) {
		int minValue = 1;	//樂透起始號碼
		int maxValue = 49;	//樂透最大號碼 1~79
		int dislineNumber = 4;	//不喜歡的數字1~9
		for(int i = minValue; i <= maxValue; i++) {
			if(i < 10 && i != dislineNumber) {
				System.out.println(i);
			}else if( (i + (10 - dislineNumber)) % 10 == 0){
				continue;
			}else if( (i / 10) % dislineNumber == 0){
				continue;
			}else {
				System.out.println(i);
			}
		}
	}
}
