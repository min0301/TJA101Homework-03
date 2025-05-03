package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile {
	
	void copyFile(File inPutData , File outPutData) throws IOException {
		try(
			FileReader fr = new FileReader(inPutData);
			BufferedReader br = new BufferedReader(fr);
				
			FileWriter fw = new FileWriter(outPutData);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
				){
			String str;
			while((str = br.readLine()) != null){
				pw.println(str);
			}		
		}

	}

}
