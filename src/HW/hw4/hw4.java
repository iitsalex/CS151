public class hw4 {
	public static void main(String[] args) {
//		BankAccount account = new BankAccount(); // Deprecated BankAccount - not threadsafe
		SynchronizedBankAccount account = new SynchronizedBankAccount();
		final double AMOUNT = 100;
		final int ITERATIONS = 1000;

		DepositRunnable depositRunnable = new DepositRunnable(account, AMOUNT, ITERATIONS);
		WithdrawRunnable withdrawRunnable = new WithdrawRunnable(account, AMOUNT, ITERATIONS);

		Thread t1 = new Thread(depositRunnable);
		Thread t2 = new Thread(withdrawRunnable);

		t1.start();
		t2.start();

	}
}
