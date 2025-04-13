package hw5;

public class InkBrush extends Pen {
	
	void setprice(double price) {
		price = price * 0.9;
		super.setprice(price);
	}
	
	@Override
	String write() {
		String InkBrush = "沾墨汁再寫";
		return InkBrush;
	}
	
}
