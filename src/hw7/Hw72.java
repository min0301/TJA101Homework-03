package hw7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Hw72 {
	public static void main(String[] args) {

		File outPutFile = new File("./src/hW7/Data.txt");
		Random random = new Random();
		Set<Integer> randomNumber = new TreeSet<>();
		while(randomNumber.size() < 10) {
			int x = random.nextInt(1000) + 1;
			randomNumber.add(x);
		}

		try(FileWriter fw = new FileWriter(outPutFile,true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw)){	
			pw.println(randomNumber);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(randomNumber);
	}
}
