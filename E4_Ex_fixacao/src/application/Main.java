package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDay = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDay);
		System.out.println("Enter order data: ");
		Date moment = new Date();
		sc.nextLine();
		System.out.print("Status: ");
		String status = sc.nextLine();
		Order order = new Order(moment, OrderStatus.valueOf(status));
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		OrderItem item = null;
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity =sc.nextInt();
			item = new OrderItem(new Product(productName, productPrice), quantity, productPrice);
			order.addItem(item);
		}
		
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		System.out.println(client);
		System.out.println("Order items: ");
		for(OrderItem i : order.getItems()) {
			System.out.println(i);
		}
		System.out.print("Total price: $");
		Double sum = 0.00;
		for(OrderItem i : order.getItems()) {
			sum += i.SubTotal();
		}
		System.out.printf("%.2f", sum);
		
		
		
		
		
		sc.close();
	}

}
