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
	public static void zoomIn(GrowableIcon shape, JLabel label)
	{
		shape.grow();
		label.repaint();
	}
	
	public static void zoomOut(GrowableIcon shape, JLabel label) 
	{
		shape.shrink();
		label.repaint();
	}
	
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final GrowableIcon shape
            = new CarIcon(0, 0, CAR_WIDTH);

      ShapeIcon icon = new ShapeIcon(shape,
            ICON_WIDTH, ICON_HEIGHT);

      final JLabel label = new JLabel(icon);
      
      JButton zoomIn = new JButton("Zoom In");
      zoomIn.addActionListener(event -> zoomIn(shape, label));
      
      JButton zoomOut = new JButton("Zoom Out");
      zoomOut.addActionListener(event -> zoomOut(shape, label));
      
      
      frame.setLayout(new FlowLayout());
      frame.add(zoomIn);
      frame.add(zoomOut);
      frame.add(label);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
