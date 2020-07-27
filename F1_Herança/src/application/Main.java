package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("UPCASTING AND DOWNCASTING");
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING - pegar um objeto do tipo businessAccount e
		//atribuir para uma variavel do tipo Account
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING - pegar um objeto do tipo Account e
		//atribuit para uma variavel do tipo BusinessAccount
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		//Evitar este tipo de erro: (Testar)
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan effected!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update effected!");
		}
		
		
		System.out.println("---------------");
		System.out.println("@OVERRIDE");
		System.out.println("Normal Account have a tax of 5");
		Account acc6 = new Account(1001, "ALEX", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		System.out.println("Savings Account don`t have a tax");
		Account acc7 = new SavingsAccount(1002, "MARIA", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		System.out.println("----------------");
		System.out.println("SUPER");
		Account acc8 = new BusinessAccount(1003, "Lucas", 33000.0, 10000000.0);
		acc8.withdraw(200.00);
		System.out.println(acc8.getBalance());
		
		System.out.println("----------------");
		System.out.println("POLIMORFISMO");
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1020, "Alex", 1000.0, 0.1);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
