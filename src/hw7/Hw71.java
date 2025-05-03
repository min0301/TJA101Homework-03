package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hw71 {
	
	public static void main(String[] args) {
		File inputFile = new File("./src/hw7/Sample.txt");
		int charcount = 0;
		int linecount = 0;
		String fileName = inputFile.getName();
		long byteCount = inputFile.length() ;
		try(FileReader fr = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(fr)) {
			String str;

			while((str = br.readLine()) != null) {
//				System.out.println(str);
//				System.out.println("該行字元數: " + str.length()); // 加入這行
				charcount = charcount + str.length();
				linecount++;
			}
		}catch (IOException e) {

		}

		System.out.println(fileName + " 檔案共有： " + byteCount + " 個位元組， " + charcount +" 個字元組， " + linecount + " 列資料。");

	}

}
