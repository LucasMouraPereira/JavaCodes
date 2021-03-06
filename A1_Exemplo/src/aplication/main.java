package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product;
		product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
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
