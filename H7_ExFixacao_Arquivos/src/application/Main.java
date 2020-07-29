package application;

import model.entities.Product;


public class Main {

	public static void main(String[] args) {
		String path = "/Users/lucasmourapereira/in.csv";
		Product product = new Product();
		
		product.readFile(path);
		if(product.createFolder(path) == true) {
			product.createFolder(path);
			System.out.println("Directory created successfully: " + product.createFolder(path));
		} else {
			System.out.println("Directory exist: " + product.createFolder(path));
		}
		
		product.writeFile(path);

		
	}
}
