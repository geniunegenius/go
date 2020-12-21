package goGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;





public class Gameplay extends JPanel implements ActionListener, KeyListener{
	JFrame window = new JFrame("Go Game");
	JButton exit = new JButton("Exit");
	
	
	
	private boolean running = true;
	private Timer time;
	private int delay = 8;
	int xmouse, ymouse;
	
			
	
	public void drawCircle(int x, int y) {
		Graphics g = this.getGraphics();
		/*PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int xmouse = (int) b.getX();
		int ymouse = (int) b.getY();*/
		int radiusmouse = 10, diametermouse = radiusmouse * 2;		
		g.fillOval(x, y, diametermouse, diametermouse);
		
	}
	
	public void drawMap(Graphics g) {
		//draw map
		g.setColor(Color.orange);
		g.fillRect(100, 100, 600, 600);
		int i = 1, j = 1, x = 140, y = 140;
		int radius = 4, diameter = radius * 2;

		while(j <= 8) {
			while(i <= 8) {
				g.setColor(Color.black);
				g.drawRect(x, y, 65, 65);
				if((i == 3 && j == 3) || (i == 7 && j == 3) || (i == 5 && j == 5) || (i == 3 && j == 7) || (i == 7 && j == 7))
					g.fillOval(x - radius, y - radius, diameter, diameter);
				x += 65;
				i++;
			}
			i = 1;
			x = 140;
			j++;
			y += 65;
		}
	}
	
	public void paintComponents(Graphics g) {
		drawMap(g);
		//drawCircle(xmouse,ymouse);
	}

	
	public Gameplay(){
		addKeyListener(this);
		setFocusTraversalKeysEnabled(true);
		
		
		time = new Timer(delay, this);
		time.start();
		
		repaint();
		
		//Setting up the buttons
		/*exit.setLocation(100,700);
		exit.setSize(100,30);
		exit.setBackground(Color.gray);
		exit.addActionListener(this);
		exit.addKeyListener(this);
		window.add(exit);
		*/
		window.add(this);
		//Setting up the window
		window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		window.setUndecorated(true);
		window.setVisible(true);
	}
	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	

}
