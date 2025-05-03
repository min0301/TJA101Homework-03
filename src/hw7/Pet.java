package hw7;

import java.io.Serializable;

public class Pet implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Pet() {
	}
	
	public Pet(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void speak() {
		
	}
	

}
