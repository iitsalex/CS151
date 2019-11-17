package hw4Q2;

import javax.swing.JLabel;
import javax.swing.Timer;

public class CarRunnable implements Runnable {
	private int DELAY;
	private MoveableShape shape;
	private JLabel label;

	public CarRunnable(int DELAY, MoveableShape shape, JLabel label) {
		this.DELAY = DELAY;
		this.shape = shape;
		this.label = label;
	}

	@Override
	public void run() {
		// Milliseconds between timer ticks
		Timer t = new Timer(DELAY, event -> {
			this.shape.move();
			this.label.repaint();
		});
		t.start();
	}

}
