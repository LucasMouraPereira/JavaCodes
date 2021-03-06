package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt();
		
		Product product;
		product = new Product(name, price);
		
		System.out.println();
		System.out.println(product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		System.out.println();
		System.out.println(product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		System.out.println();
		System.out.println(product);
				
		sc.close();
	}

}
