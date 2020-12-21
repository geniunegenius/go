package goGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Rules extends JPanel implements ActionListener, KeyListener{
	
	JFrame window = new JFrame("Go Game");
	JButton prevButton = new JButton("Menu");
	
	Rules(){

		
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new BorderLayout());
		

		//add previous button
		prevButton.setLocation(200,200);
		prevButton.setSize(100,30);
		prevButton.setBackground(Color.gray);
		prevButton.addActionListener(this);
		prevButton.addKeyListener(this);
		window.add(prevButton);
		
		//add text
		window.add(new JTextArea("-dimensiunile uzuale ale tablei sunt de 9x9, 13x13 sau 19x19 linii.\n"
				+ "-o mutare la Go se face prin plasarea unei pietre pe o intersectie a liniilor tablei."), BorderLayout.CENTER);
		
		
		
		window.pack();
		window.add(this);
		
		//Setting up the window
		window.setLocation(100,50);
		//window.setUndecorated(true);
		window.setSize(1000,600);
		window.setBackground(Color.white);
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
		if(e.getSource() == prevButton)
		{
			window.dispose();
			Menu m = new Menu();
		}
	}

}
