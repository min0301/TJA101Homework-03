package hw5;

public abstract class Pen {

private String brand;
private double price;

	void pen() {
		
	}
	
	void pen(String brand,double price) {
		setbrand(brand);
		setprice(price);
	}

	void setbrand(String brand){
		this.brand = brand;
	}
	
	String getbrand(){
		return brand;
	}
	
	void setprice(double price) {
		try{
			if(price == 0) {
				this.price = 99999;
				throw new ArithmeticException();	
			}else {
				this.price = price;	
			}
		}catch(Exception e) {
			this.brand = brand + " - 標價錯誤請確認";
		}

	}
	
	Double getprice() {
		return price;
	}
	
	abstract String write();
	
	
	void print() {
		System.out.println("總類 ： " + brand);
		System.out.println("售價 ： " + price);
		System.out.println("使用方式 ： " + write());
	}
	
}
