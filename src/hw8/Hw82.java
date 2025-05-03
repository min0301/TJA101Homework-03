package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hw82 {
	

	public static void main(String[] args) {
		
		System.out.println("===印出不重複的Train物件===");
		Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train train3 = new Train(118, "自強", "高雄", "台北", 500);
		Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		Set<Train> trainsSet = new HashSet<>();
		trainsSet.add(train1);
		trainsSet.add(train2);
		trainsSet.add(train3);
		trainsSet.add(train4);
		trainsSet.add(train5);
		trainsSet.add(train6);
		trainsSet.add(train7);
	
		System.out.println("========foreach========");
		for(Train x1:trainsSet) {
			x1.printTrain();
		}
		
		System.out.println("========Iteretor========");
		Iterator i1 = trainsSet.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("====班次編號由大到小印出====");
		List<Train> trainList = new ArrayList<>();
		trainList.add(train1);
		trainList.add(train2);
		trainList.add(train3);
		trainList.add(train4);
		trainList.add(train5);
		trainList.add(train6);
		trainList.add(train7);
		
		Collections.sort(trainList , Collections.reverseOrder());
		
		System.out.println("========foreach========");		
		for(Train x2 : trainList) {
			System.out.println(x2);
		}
		System.out.println("========Iteretor========");
		Iterator i2 = trainList.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("==========for==========");
		for(int i = 0 ; i < trainList.size() ; i++) {
			System.out.println(trainList.get(i));
		}
		System.out.println();
		System.out.println();
		System.out.println("====由大排到小印出， 還可以不重複印出Train物件====");
		Map<Integer , Train> trainMap = new TreeMap<>(Collections.reverseOrder());
		trainMap.put(train1.getNumber(), train1);
		trainMap.put(train2.getNumber(), train2);
		trainMap.put(train3.getNumber(), train3);
		trainMap.put(train4.getNumber(), train4);
		trainMap.put(train5.getNumber(), train5);
		trainMap.put(train6.getNumber(), train6);
		trainMap.put(train7.getNumber(), train7);
		
		System.out.println("========foreach========");	
		for(Train x3:trainMap.values()) {
			System.out.println(x3);
		}
		System.out.println("========Iteretor========");
		Iterator i3 = trainMap.values().iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
		
	}
}
