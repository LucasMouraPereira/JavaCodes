package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {
	private SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureData;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureData) {
		super(name, price);
		this.manufactureData = manufactureData;
	}

	public Date getManufactureData() {
		return manufactureData;
	}

	public void setManufactureData(Date manufactureData) {
		this.manufactureData = manufactureData;
	}
	
	@Override
	public String priceTag() {
		return " (used) " + super.priceTag() + " (Manufacture date: " + sdf.format(manufactureData).toString() + ")";
	}
}
