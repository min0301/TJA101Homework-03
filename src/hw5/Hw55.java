package hw5;

import java.util.Random;

public class Hw55 {
	
	public String genAuthCode() {
		
		String x = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		int count = 8;
		char[] code = new char[count];
		
		Random random = new Random();
		for(int i = 0 ; i < count ; i++) {
			int randomIndex = random.nextInt(x.length());
			code[i] = x.charAt(randomIndex);
		}
		
		String captcha = new String(code);
		return captcha;
	}
	
	public static void main(String[] args) {
		
		Hw55 captcha = new Hw55();
		
		System.out.println("本次產生的驗證碼為：");
		System.out.println(captcha.genAuthCode());
		
	}

}
