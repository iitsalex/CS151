package lab2;
import java.awt.*;
import javax.swing.*;

public class FrameTester {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JButton repaintRed = new JButton("Repaint Red");
		JButton repaintBlue = new JButton("Repaint Blue");
		JButton repaintGreen = new JButton("Repaint Green");
		
		frame.setLayout(new FlowLayout());
		
		frame.add(repaintRed);
		frame.add(repaintBlue);
		frame.add(repaintGreen);
		
		frame.pack();
		frame.setVisible(true);

	}
		
}
