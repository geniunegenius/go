package goGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener,KeyListener{
	
	JFrame window = new JFrame("Go Game");
	JButton playButton = new JButton("Play");
	JButton howButton = new JButton("Rules");
	JButton exitButton = new JButton("Exit");
	
	Menu(){
		
		//Setting up the buttons
		playButton.setLocation(200,200);
		playButton.setSize(100,30);
		playButton.setBackground(Color.gray);
		playButton.addActionListener(this);
		playButton.addKeyListener(this);
		window.add(playButton);

		howButton.setLocation(200,235);
		howButton.setSize(100,30);
		howButton.setBackground(Color.gray);
		howButton.addActionListener(this);
		howButton.addKeyListener(this);
		window.add(howButton);
			
		exitButton.setLocation(200,270);
		exitButton.setSize(100,30);
		exitButton.setBackground(Color.gray);
		exitButton.addActionListener(this);
		exitButton.addKeyListener(this);
		window.add(exitButton);

		window.add(this);
		
		//Setting up the window
		window.setLocation(100,50);
		//window.setUndecorated(true);
		window.setSize(1000,600);
		window.setVisible(true);
		
	}
		
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
			window.dispose();
		}
		
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exitButton) {
			window.dispose();
		}
		if(e.getSource() == playButton) {
			window.dispose();
			Gameplay g = new Gameplay();
		}
		if(e.getSource() == howButton) {
			window.dispose();
			Rules r = new Rules();
		}
		
	}

	
	//Paint image from opening window
		public void paint(Graphics g) {
			
			ImageIcon background = new ImageIcon("images//menuimg.jpg");
			
			g.drawImage(background.getImage(),0,0,null);
		}

	
}


