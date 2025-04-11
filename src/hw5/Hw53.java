package hw5;

public class Hw53 {
	
	
	public void maxElement(){
	
	}
	public double maxElement(double x[][]){
		double max = 0;
		for(int i = 0 ; i < x.length ; i++) {
			for(double y : x[i]) {
				if(max < y) {
					max = y;
				}
			}
		}
		return max;
	}
	public int maxElement(int x[][]){
		int max = 0;
		for(int i = 0 ; i < x.length ; i++) {
			for(int y : x[i]) {
				if(max < y) {
					max = y;
				}
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		
		Hw53 w = new Hw53();
		
		int[][] intArray = {
					{1, 6, 3},
					{9, 5, 2}
					};
		
		System.out.println(w.maxElement(intArray));
		
		
		double[][] doubleArray = {
					{1.2, 3.5, 2.2},
					{7.4, 2.1, 8.2}
					};
		System.out.println(w.maxElement(doubleArray));
		
		
	}

}
