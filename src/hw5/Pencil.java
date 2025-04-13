package hw5;

public class Pencil extends Pen {
		
		
		String write() {
			String write ="削鉛筆再寫";
			return write;
		};
		
		@Override
		void setprice(double price) {
			price = price * 0.8;
			super.setprice(price);
		}


}
