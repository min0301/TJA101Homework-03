package hw7;

import java.io.File;
import java.io.IOException;

public class Hw73 {

	public static void main(String[] args) {
		
		File inPutFile = new File("./src/hW7/Data.txt");
		File outPutFile = new File("./src/hW7/Data2.txt");
		CopyFile copy =new CopyFile();
		try {
			copy.copyFile(inPutFile,outPutFile);
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

