package hw6;

public class Calculator {

	int x,y;
	
	//方法1
//	 void powerXY(int x, int y) {
//		 try {
//			 if(x == y && x == 0) {
//				 throw new CalException("0 的 0 次方沒有意義");
//			 }else if(y < 0) {
//				 throw new CalException("次方為負值,結果回傳不為整數！"); 
//			 }
//				this.x = x ;
//				this.y = y ;
//				System.out.println( x + " 的 " + y + " 次方等於 " + getPowerXY());
//
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//	}
	
	//方法2
	 void powerXY(int x, int y) {
				this.x = x ;
				this.y = y ;
				System.out.println( x + " 的 " + y + " 次方等於 " + getPowerXY());
	}
	 
	 
	 int getPowerXY() {
			double powerXY = Math.pow(x,y);	
			return (int)powerXY;
	 }
	 
	 void setPowerXY(int x, int y){
			this.x = x ;
			this.y = y ;
	 }

}
