import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * This program implements an animation that moves a car shape.
 */
public class hw4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		final MoveableShape shape1 = new CarShape(0, 0, CAR_WIDTH);
		final MoveableShape shape2 = new CarShape(0, 0, CAR_WIDTH);
		final MoveableShape shape3 = new CarShape(0, 0, CAR_WIDTH);
		final MoveableShape shape4 = new CarShape(0, 0, CAR_WIDTH);

		ShapeIcon icon1 = new ShapeIcon(shape1, ICON_WIDTH, ICON_HEIGHT);
		ShapeIcon icon2 = new ShapeIcon(shape2, ICON_WIDTH, ICON_HEIGHT);
		ShapeIcon icon3 = new ShapeIcon(shape3, ICON_WIDTH, ICON_HEIGHT);
		ShapeIcon icon4 = new ShapeIcon(shape4, ICON_WIDTH, ICON_HEIGHT);

		final JLabel label1 = new JLabel(icon1);
		final JLabel label2 = new JLabel(icon2);
		final JLabel label3 = new JLabel(icon3);
		final JLabel label4 = new JLabel(icon4);

		frame.setLayout(new FlowLayout());
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		final int DELAY1 = 100;
		final int DELAY2 = 50;
		final int DELAY3 = 25;
		final int DELAY4 = 12;

		CarRunnable car1 = new CarRunnable(DELAY1, shape1, label1);
		CarRunnable car2 = new CarRunnable(DELAY2, shape2, label2);
		CarRunnable car3 = new CarRunnable(DELAY3, shape3, label3);
		CarRunnable car4 = new CarRunnable(DELAY4, shape4, label4);

		Thread t1 = new Thread(car1);
		Thread t2 = new Thread(car2);
		Thread t3 = new Thread(car3);
		Thread t4 = new Thread(car4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

	private static final int ICON_WIDTH = 400;
	private static final int ICON_HEIGHT = 100;
	private static final int CAR_WIDTH = 100;
}
