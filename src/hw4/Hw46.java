package hw4;

public class Hw46 {
	
	public static void main(String[] args) {
		
		int max = 0; 
		int[] student = new int[8];
		int[][] test1 = {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}
			};
		
		for(int i = 0 ; i < test1.length ; i++) {
			for(int j = 0 ; j < test1[i].length ; j++) {
				if(test1[i][j]>test1[i][max] ) {
					max = j;
				}		
			}
			student[max]=student[max]+1;
		}
		
		for(int i = 0 ; i < student.length ; i++) {
			System.out.println("學生 " + (i + 1) + " 最高分次數為： " + student[i]);
		}
		
	}
}
