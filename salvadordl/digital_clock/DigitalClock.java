import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class DigitalClock extends JPanel{
	JFrame frame;

	int currentHour;
	int currentMinute;
	int currentSecond;

	Font myFont=new Font("Tahoma",Font.BOLD+Font.ITALIC,20);
	Color myColor=new Color(205,105,0);
	FontMetrics fm;

public DigitalClock(){
	frame=new JFrame("Digital Clock");
	
	frame.add(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,300);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	
	while(true){
		repaint();
		try{
			Thread.sleep(900);
			}
		catch(Exception exception){
	  exception.printStackTrace();
		}
	}
}

public void paint(Graphics g){
	super.paint(g);
	Date myDate=new Date();
	
	currentHour=myDate.getHours();
	currentMinute=myDate.getMinutes();
	currentSecond=myDate.getSeconds();
	
	g.setFont(myFont);
	fm=g.getFontMetrics();
	int hourXCoordinate=20;
	int minuteXCoordinate=hourXCoordinate+(fm.getMaxAdvance()*2);
	int secondXCoordinate=hourXCoordinate+(fm.getMaxAdvance()*4);
	
	g.setColor(myColor);
	g.drawString(Integer.toString(currentHour),hourXCoordinate,20);
	g.drawString(":",(hourXCoordinate+minuteXCoordinate)/2,20);
	g.drawString(Integer.toString(currentMinute),minuteXCoordinate,20);
	g.drawString(":",(secondXCoordinate+minuteXCoordinate)/2,20);
	g.drawString(Integer.toString(currentSecond),secondXCoordinate,20);
}
	
public static void main(String[]args){
	DigitalClock digitalclock=new DigitalClock();
	}
}
