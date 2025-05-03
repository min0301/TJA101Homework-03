package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Hw74 {
	
	public static void main(String[] args) {
		
		File data = new File("./src/hW7/data");
		data.mkdir();
		File file = new File("./src/hW7/data/Object.ser");
		
		Pet[] pets = new Pet[4];
		pets[0] = new Dog("大汪");
		pets[1] = new Dog("小汪");
		pets[2] = new Cat("大咪");
		pets[3] = new Cat("小咪");

		
		try(
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				) {
			for(Pet pet:pets) {
				oos.writeObject(pet);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis)
					) {
					while(true) {
		                Pet pet = (Pet) ois.readObject();
		                pet.speak();
					}			
			} catch (EOFException e) {
				System.out.println("讀取完畢！！");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
