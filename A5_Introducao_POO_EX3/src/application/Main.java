package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student;
		student = new Student();
		
		student.name = sc.nextLine();
		student.fistQuarter = sc.nextDouble();
		student.secondQuarter = sc.nextDouble();
		student.thirdQuarter = sc.nextDouble();
		
		System.out.print(student);
		student.result();
		
		sc.close();
	}
}
