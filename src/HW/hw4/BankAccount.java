package hw4;

public class BankAccount {

	private double balance;

	public BankAccount() {
		balance = 0;
	}

	public void deposit(double amount) {
		System.out.print("Depositing " + amount + " into account");
		double newBalance = balance + amount;
		System.out.println(", balance is now " + newBalance);
		balance = newBalance;
	}

	public void withdraw(double amount) {
		System.out.print("Withdrawing " + amount + " into account");
		double newBalance = balance - amount;
		System.out.println(", balance is now " + newBalance);
		balance = newBalance;
	}

	public double getBalance() {
		return balance;
	}

}