package assignments;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class cardataa {

	@Id
	private int carid;
	
	private String carName;
	
	private double price;

	public cardataa() {
		super();
	}

	public cardataa(int carid, String carName, double price) {
		super();
		this.carid = carid;
		this.carName = carName;
		this.price = price;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
