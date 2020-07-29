package model.entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private Double price;
	private Integer quantity;
	
	private List<Product> products = new ArrayList<>();
	
	public Product() {
		
	}

	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public List<Product> getProduct() {
		return products;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public Double totalPrice() {
		return price * quantity;
	}
	
	public void readFile(String path) {
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line  = br.readLine();
			while(line != null) {
				String[] word = line.split(";");
				name = word[0];
				price = Double.parseDouble(word[1]);
				quantity = Integer.parseInt(word[2]);
				Product product = new Product(name, price, quantity);
				addProduct(product);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}	
	}
	
	public boolean createFolder(String path) {
		File dir = new File(path);
		boolean success = new File(dir.getParent() + "/out").mkdir();
		return success;
	}
	
	public void writeFile(String path) {
		File dir = new File(path);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(dir.getParent() + "/out/summary.csv"))) {
			for(Product p : products) {
				bw.write(p.getName() + ";" + p.totalPrice());
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
