package hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Train implements Comparable<Train> {
//	請設計一個Train類別，並包含以下屬性：
//	- 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
//	- 目的地 dest，型別為String - 票價 price，型別為double
	
		private int number;
		private String type;
		private String start;
		private String dest;
		private Double price;
		
		public Train() {
			
		}
		
		public Train(int number, String type ,String start, String dest, double price) {
			this.number = number;
			this.type = type;
			this.start = start;
			this.dest = dest;
			this.price = price;
		}
		
		@Override
		public String toString() {
			return  number + "," + type + "," + start + "," + dest + ","+ price;
		}

		public void setNunber() {
			this.number = number;
		}
		
		public int getNumber() {
			return number;
		}
		
		public void setType() {
			this.type = type;
		}
		
		public String getType() {
			return type;
		}
		
		public void setStart() {
			this.start = start;
		}
		
		public String getStart() {
			return start;
		}
		
		public void setDest() {
			this.dest = dest;
		}
		
		public String getDest() {
			return dest;
		}
		
		public void setPrice() {
			this.price = price;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void printTrain() {
			System.out.println(number+ ","+ type+ ","+ start+ ","+ dest+ ","+ price);
		}
		
		
		@Override
		public int hashCode() {
			return Objects.hash(number, price, type);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Train other = (Train) obj;
			return number == other.number && Objects.equals(price, other.price) && Objects.equals(type, other.type);
		}
		

		@Override
		public int compareTo(Train o) {
			return (this.number - o.number);
		}
		



}
