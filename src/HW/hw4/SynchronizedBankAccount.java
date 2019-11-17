package hw4;

public class SynchronizedBankAccount {

	private double balance;
//	private Lock balanceLock;

	public SynchronizedBankAccount() {
		// balanceLock = new ReentrantLock();
		balance = 0;
	}

	public synchronized void deposit(double amount) {
		// balanceLock.lock();
//		try {
		System.out.print("Depositing " + amount + " into account");
		double newBalance = balance + amount;
		System.out.println(", balance is now " + newBalance);
		balance = newBalance;
//		} finally {
//			// balanceLock.unlock();
//		}
	}

	public synchronized void withdraw(double amount) {
		// balanceLock.lock();
		// try {
		System.out.print("Withdrawing " + amount + " into account");
		double newBalance = balance - amount;
		System.out.println(", balance is now " + newBalance);
		balance = newBalance;
		// } finally {
		// balanceLock.unlock();
		// }
	}

	public double getBalance() {
		return balance;
	}

}