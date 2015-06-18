import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class Clock extends JPanel{

    public static int W = 500;
    public static int H = 500;    

    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        // Getting current time
        Calendar calendar = Calendar.getInstance();

        int h = (calendar.get(Calendar.HOUR));
        int min = (calendar.get(Calendar.MINUTE));
        int sec = (calendar.get(Calendar.SECOND));

        // Сlock face    
        g.setColor(Color.WHITE);
        g.fillOval(50, 50, 400, 400);
        g.setColor(Color.BLACK);
        g.fillOval(240, 240, 20, 20);

        // 12, 3, 6, 9
        g.setColor(Color.BLACK);
        g.fillRect(240, 60, 20, 20);
        g.setColor(Color.BLACK);
        g.fillRect(240, 420, 20, 20);
        g.setColor(Color.BLACK);
        g.fillRect(60, 240, 20, 20);
        g.setColor(Color.BLACK);
        g.fillRect(420, 240, 20, 20);

        // Current time to coordinates
        int xh = (int)(Math.cos((h*30 + min / 2) * 3.14f/180 - 3.14f/2) * 80 + W/2);
        int yh = (int)(Math.sin((h*30 + min / 2) * 3.14f/180 - 3.14f/2) * 80 + H/2);
        int xmin = (int)(Math.cos(min * 3.14f / 30 - 3.14f/2)  * 100 + W/2);
        int ymin = (int)(Math.sin(min * 3.14f / 30 - 3.14f / 2)  * 100 + H/2);
        int xsec = (int) (Math.cos(sec * 3.14f / 30 - 3.14f / 2) * 120 + W/2);
        int ysec = (int) (Math.sin(sec * 3.14f / 30 - 3.14f / 2) * 120 + H/2);

        // Arrows
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(10));
        g.setColor(Color.BLACK);
        g.drawLine(W/2, H/2, xh, yh);

        g2.setStroke(new BasicStroke(5));
        g.setColor(Color.BLACK);
        g.drawLine(W/2, H/2, xmin, ymin);

        g2.setStroke(new BasicStroke(2));
        g.setColor(Color.RED);
        g.drawLine(W/2, H/2, xsec, ysec);

        repaint();
    }

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        Clock clock = new Clock();        
        frame.setSize(W, H);
        frame.add(clock);
        frame.setVisible(true);

    }
}
