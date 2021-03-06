package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValuelnStock() {
		double totalValue = quantity * price;
		return totalValue;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
		TotalValuelnStock();
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
		TotalValuelnStock();
	}
	
	public String toString() {
		return "Product data: " 
				+ name 
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", "
				+ quantity 
				+ " units, " 
				+ "Total: $ " 
				+ String.format("%.2f", TotalValuelnStock());

	}
	
}
