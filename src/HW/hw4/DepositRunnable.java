public class DepositRunnable implements Runnable {

	private static final int DELAY = 1;
	private SynchronizedBankAccount account;
//	private BankAccount bankAccount;
	private double amount;
	private int count;

	public DepositRunnable(SynchronizedBankAccount account, double amount, int count) {
		this.account = account;
		this.amount = amount;
		this.count = count;
	}
//	Deprecated depositRunnable for non-thread-safe bankaccount
//	
//	public DepositRunnable(BankAccount bankAccount, double amount, int count) {
//		this.bankAccount = bankAccount;
//		this.amount = amount;
//		this.count = count;
//	}

	public void run() {
		try {
			for (int i = 1; i <= count; i++) {
				account.deposit(amount);
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException exception) {
		}
	}

}