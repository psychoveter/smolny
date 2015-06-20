import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.function.Function;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.geom.Line2D;


public class Mand {
	
	public static final int W = 1366;
	public static final int H = 728;
	
	public static void main(String... args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel surf = new AxisSurface();
		
		frame.setSize(W, H);
		frame.add(surf);
		
		frame.setVisible(true);
	}
	
	public static double f(double x) {
		return ( - Math.exp(-x) + 1)
				/ (x - 10) ;
	}
}

class AxisSurface extends JPanel {
    @Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		//g2.drawString("Hello, Paint!", 100, 100);
		//g2.drawLine(250, 250, 500, 500);
		//g2.drawLine(500, 500, 250, 500);
		//g2.drawLine(250, 500, 250, 250);
		g2.drawLine(0, 364, 1366, 364);
		g2.drawLine(683, 0, 683, 728);
//		g2.drawOval(583, -364, 200, 728);
//		drawFunction(g2, Mand::f);
		int x;
		int y;
		int x2; 
		int y2;

		for (x = 1; x <= 10; x++) {
			for (y = 1; y <=10; y++); {
				x2 = -(x*x); 
				y2 = -(y*y); 
				g2.drawLine(x2, y2, 1, 1);
			}
		}
    }
    
        

private void drawFunction(Graphics2D g2, Function<Double, Double> func) {
    double zx, zy, cX, cY, temp; {
	for (int y = 0; y < getHeight(); y++) {
        for (int x = 0; x < getWidth(); x++) {
            zx = zy = 0;
            cX = (x - 800) / 300;
            cY = (y - 600) / 300;
            int iteration = 500;
            while (zx * zx + zy * zy < 4 && iteration > 0) {
                temp = zx * zx - zy * zy + cX;
                zy = 2.0 * zx * zy + cY;
                zx = temp;
                iteration--;
//                g2.drawLine(zx, zy, cX, cY);
                }
        	}
		}
    }
}
}
/*	        for (int y = 0; y < getHeight(); y++) {
	            for (int x = 0; x < getWidth(); x++) {
	                zx = zy = 0;
	                cX = (x - 400) / ZOOM;
	                cY = (y - 300) / ZOOM;
	                int iter = MAX_ITER;
	                while (zx * zx + zy * zy < 4 && iter > 0) {
	                    tmp = zx * zx - zy * zy + cX;
	                    zy = 2.0 * zx * zy + cY;
	                    zx = tmp;
	                    iter--;
	                }
*/
// Mand::f - ссылка на функцию (функции можно передавать в качестве параметра функции)
// First Class Object
	/*
	private void drawFunction(Graphics2D g2, Function<Double, Double> func, double xmin, double xmax) {
		double delta = 0.01;
		for(double x = xmin; x < xmax; x += delta) {
			double y = func.apply(x);
			
			int xx = 0;
			int yy = 0;
			g2.drawRect(xx, yy, 1, 1);
		}
	}
	*/
    
class MandSurface extends JPanel {

	
	public static final int X0 = Mand.W/2;
	public static final int Y0 = Mand.H/2;
	
	public int lastX;
	public int lastY;
	public double scale = 400;
	}

/*
public void paintComponent(Graphics G) {
	super.paintComponent(g);
	
	Graphics2D g2 = (Graphics2D)g;
	drawAxis(g2);
}
*/
