package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhisicalPerson;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<Person> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char person = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if(person == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				PhisicalPerson individual = new PhisicalPerson(name, annualIncome, healthExpenditures); 
				list.add(individual);
			} else {
				System.out.print("Number of employees: ");
				int quantityEmployees = sc.nextInt();
				LegalPerson company = new LegalPerson(name, annualIncome, quantityEmployees); 
				list.add(company);
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for(Person p : list) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f", p.incomeTax()));
			sum += p.incomeTax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));		
		
		sc.close();

	}

}
