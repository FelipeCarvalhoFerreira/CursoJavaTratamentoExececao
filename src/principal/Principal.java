package principal;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Principal {

	public static void main(String[] args) throws DomainException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			
			System.out.println("Enter account data ");

			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();

			System.out.print("Enter amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			account.withdraw(withdraw);

		} catch (DomainException e) {
			System.out.print("Withdraw error: " + e.getMessage());
		}
		 
		catch (RuntimeException e) {
			System.out.print("Unexpected error");
		}

		sc.close();

	}

}
