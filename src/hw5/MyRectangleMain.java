package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		
		
		MyRectangl x = new MyRectangl();
		
		x.setWidth(10);
		x.setDepth(20);
		System.out.println(x.getArea());
		
		x.myRectangle(10,20);
		System.out.println(x.getArea());
	}
}
