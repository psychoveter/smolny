package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import position.Position;
 	
public class Game extends JFrame {
	
	Position position = new Position();
	JButton[] buttons = new JButton[Position.SIZE];

	public Game(){
		setLayout(new GridLayout(Position.DIM, Position.DIM));
		for(int i = 0; i <Position.SIZE; i++){
			final JButton button = createButton();
			buttons[i] = button;
			final int idx = i;
			button.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					button.setText(Character.toString(position.turn));
					position.move(idx);
					if(!position.isGameEnd()){
						int best = position.bestMove();
						buttons[best].setText(Character.toString(position.turn));
						position.move(best);
						}
			        if (position.isGameEnd()){
						String message = position.isWinFor('x') ? "You Won!" : position.isWinFor('o') ? 
								"Computer won!" : "Draw!";
						JOptionPane.showMessageDialog(null, message);	
				    }
				}
				
				});
			
			
			
		}
		pack();
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private JButton createButton() {
		JButton button = new JButton();
		button.setPreferredSize(new Dimension(100, 100));
		button.setBackground(Color.CYAN);
		button.setFont(new Font(null, Font.PLAIN, 100));
		button.setOpaque(true);
		add(button);
		return button;
	}

	public static void main (String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new Game();
			}
		});
			
	}
	
}
