public class WithdrawRunnable implements Runnable {

	private static final int DELAY = 1;
	private SynchronizedBankAccount account;
//	private BankAccount bankAccount;
	private double amount;
	private int count;

	public WithdrawRunnable(SynchronizedBankAccount account, double amount, int count) {
		this.account = account;
		this.amount = amount;
		this.count = count;
	}

//	Deprecated withdrawRunnable for non-thread-safe bankaccount 
//	
//	public WithdrawRunnable(BankAccount bankAccount, double amount, int count) {
//		this.bankAccount = bankAccount;
//		this.amount = amount;
//		this.count = count;
//	}

	public void run() {
		try {
			for (int i = 1; i <= count; i++) {
				account.withdraw(amount);
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException exception) {
		}
	}

}