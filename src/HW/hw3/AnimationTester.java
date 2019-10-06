package hw3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{	
	public static void zoomIn(CarIcon car, JLabel label)
	{
		car.width+=20;
		label.setIcon(new CarIcon(car.width));
		label.repaint();
	}
	
	public static void zoomOut(CarIcon car, JLabel label)
	{
		car.width-=20;
		label.setIcon(new CarIcon(car.width));
		label.repaint();
	}
	
	
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();      
      CarIcon car = new CarIcon(100);
      
      final JLabel label = new JLabel(car);
      
      JButton zoomIn = new JButton("Zoom In");
      zoomIn.addActionListener(event -> {
    	  zoomIn(car, label);
	  });
      
      JButton zoomOut = new JButton("Zoom Out");
      zoomOut.addActionListener(event -> {
    	  zoomOut(car, label);
      });
      
      
      frame.setLayout(new FlowLayout());
      frame.add(zoomIn);
      frame.add(zoomOut);
      frame.add(label);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

   }
}
