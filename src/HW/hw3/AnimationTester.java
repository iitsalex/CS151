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
	  // create frame
      JFrame frame = new JFrame();      
      
      // create initial car object
      CarIcon car = new CarIcon(100);
      
      // create label for painting
      final JLabel label = new JLabel(car);
      
      // add zoomIn button and lambda expression for zoomIn functionality
      JButton zoomIn = new JButton("Zoom In");
      zoomIn.addActionListener(event -> {
    	  zoomIn(car, label);
	  });
      
      // add zoomOut button and lambda expression for zoomOut functionality
      JButton zoomOut = new JButton("Zoom Out");
      zoomOut.addActionListener(event -> {
    	  zoomOut(car, label);
      });
      
      // Set FlowLayout and add buttons + label
      frame.setLayout(new FlowLayout());
      frame.add(zoomIn);
      frame.add(zoomOut);
      frame.add(label);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

   }
}
