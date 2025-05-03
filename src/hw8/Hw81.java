package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw81 {
	
	
	public static void main(String[] args) {
		
		List<Object> collection = new ArrayList<>();
		collection.add(100);
		collection.add(3.14);
		collection.add(21L);
		collection.add((short)100);
		collection.add("Kitty");
		collection.add(100);
		collection.add("Snoopy");
		collection.add(BigInteger.valueOf(1000));
		
		
		System.out.println("==Iterator==");
		Iterator<Object> objs = collection.iterator();
		while(objs.hasNext()) {
			System.out.println(objs.next());
		}
		
		System.out.println("==傳統for==");
		
		for(int i = 0 ; i< collection.size();i ++ ) {
			System.out.println(collection.get(i));
		}
		
		System.out.println("==Foreach==");
		
		for(Object obj:collection) {
			System.out.println(obj);
		}
		
		System.out.println("==移除非Number==");
		collection.remove("Kitty");
		collection.remove("Snoopy");
		
		for(Object obj:collection) {
			System.out.println(obj);
		}
		
		
	}

}
