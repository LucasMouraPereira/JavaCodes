package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.Enums.Color;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			if(shape == 'r') {
				sc.nextLine();
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.nextLine());
				System.out.print("Width: ");
				double width = sc.nextDouble(); 
				System.out.print("Height: ");
				double height = sc.nextDouble();
				Rectangle rectangle = new Rectangle(color, width, height);
				list.add(rectangle);
			} else {
				sc.nextLine();
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.nextLine());
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				Circle circle = new Circle(color, radius);
				list.add(circle);
			}
			
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape s: list) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		sc. close();

	}

}
