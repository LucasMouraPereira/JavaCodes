package application;

import java.util.Scanner;

import entities.Room;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Room[] vect = new Room[10];
		
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Room(name, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");	
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
