package hw5;

public class penShop {

	public static void main(String[] args) {
		Pen pencil = new Pencil();
		Pen inkbrush = new InkBrush();
		
		inkbrush.pen("墨筆",50);
		pencil.pen("鉛筆",20);
		
		inkbrush.print();
		System.out.println("============");
		pencil.print();
		
	}
	
}
