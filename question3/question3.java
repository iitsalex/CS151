import java.util.concurrent.locks.ReentrantLock;

public class question3 {

	public static void main(String[] args) {

		WordCountRunnable.threadsLock = new ReentrantLock();
		WordCountRunnable.threads = 0;
		WordCountRunnable.totalWordCount = 0;
		WordCountRunnable.totalWordCountLock = new ReentrantLock();

		if (args.length > 0)
			System.out.println("\nWord Count of " + args.length + " arguments\n");
		for (int i = 0; i < args.length; i++) {
			WordCountRunnable wordCountRun = new WordCountRunnable(args[i]);
			Thread t = new Thread(wordCountRun);
			t.start();
		}
	}
}
