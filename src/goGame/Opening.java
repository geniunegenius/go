package goGame;

import java.awt.Graphics;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.io.File;

public class Opening extends JPanel{
	
	JFrame window = new JFrame();
	
	Opening(){
		
		window.add(this);
		
		//Setting up the window
		window.setLocation(100,50);
		//window.setUndecorated(true);
		window.setSize(1000,600);
		window.setVisible(true);
		
		try {
			//Starting the music in the opening window
			File sound = new File("music//openingmenu.wav");
			AudioInputStream oais = AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(oais);
			FloatControl gainControl = 
				    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				gainControl.setValue(-30.0f);
			clip.start();
			
			//Wait for 5 seconds and close the window and sound
			Thread.sleep(1000);
			window.dispose();
			clip.stop();
			
			//Open second window
			Menu m = new Menu();
		} 
		catch(Exception e) {}
	}
	
	//Paint image from opening window
	public void paint(Graphics g) {
		
		ImageIcon background = new ImageIcon("images//howto.jpg");
		
		g.drawImage(background.getImage(),0,0,null);
	}
	
}
