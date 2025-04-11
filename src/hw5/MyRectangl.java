package hw5;

public class MyRectangl {
	
	private double width;
	private double depth;
	private double area;
	
	void setWidth(double width) {
		this.width = width;
	}
	
	void setDepth(double depth) {
		this.depth = depth;
	}
	
	double getArea() {
		area = width * depth;
		return area;
	}
	public void myRectangle() {
		
	}
	
	public void myRectangle(double width , double depth) {
		this.width = width;
		this.depth = depth;
	}

}
