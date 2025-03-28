package hw2;

public class TestNineNine {
	public static void main(String[] args) {
		int i, j;

//		 	//使用for迴圈＋while迴圈
//		for(i = 1 ; i <= 9 ; i++) {
//			j=1;
//			while(j <= 9) {
//				System.out.print(i+ "*" +j+ "=" + i*j+ "\t");
//				j++;
//			}	
//			System.out.println();
//		}

//		//使用for迴圈＋do while迴圈
		for(i = 1 ; i <= 9 ; i++) {
			j = 1;
			do {
				System.out.print(i+ "*" +j+ "=" + i*j+ "\t");
				j++;
			}while(j <= 9);
			System.out.println();
		}

		// 使用while迴圈＋do while迴圈
//		i = 1;
//		while (i <= 9) {
//			j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			System.out.println();
//			i++;
//		}
		
	}
}
