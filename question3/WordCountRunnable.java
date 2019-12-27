import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;

public class WordCountRunnable implements Runnable {

	public static Lock threadsLock;
	public static int threads;
	
	public static int totalWordCount;
	public static Lock totalWordCountLock;

	private String filePath;

	public WordCountRunnable(String newFilePath) {
		filePath = newFilePath;
	}

	public void run() {
		threadsLock.lock();
		threads++;
		threadsLock.unlock();
		int numOfWords = 0;

		Boolean fileFound = false;
		try {
			Scanner input = new Scanner(new FileInputStream(filePath));
			while (input.hasNext()) {
				input.next();
				numOfWords++; 
			}
			fileFound = true;
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Did not find file @:  " + filePath);
		}
		if (fileFound)
			System.out.println(filePath + " - WordCount : " + numOfWords);

		totalWordCountLock.lock();
		totalWordCount += numOfWords;

		threadsLock.lock();
		threads--;

		if (threads == 0)
			System.out.println("\nTotal WordCount: " + totalWordCount);

		threadsLock.unlock();
		totalWordCountLock.unlock();
	}
}
