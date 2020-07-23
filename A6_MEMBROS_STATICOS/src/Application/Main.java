package Application;

import java.util.Locale;
import java.util.Scanner;

import Utils.Constants;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarNow = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double qtdDollar = sc.nextDouble();
		
		double result = Constants.currency(dollarNow, qtdDollar);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();

	}

}
