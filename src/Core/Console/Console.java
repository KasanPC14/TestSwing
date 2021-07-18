package Core.Console;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import Core.Draw.Draw2D;
import Core.Read.JsonReader;

public class Console extends JPanel implements KeyListener,ActionListener{

	
	
	String settingsPath = "res/ConsoleSettings.json";
	
	
	
	
	private Timer timer;
	int delay = 5;
	
	//Colors
	
	public Console(){
		
		setSettings();
		
		
	}
	
	public void paint(Graphics g) {
		//Background Color
		
		Draw2D.setBackground(g, settingsPath);
		////Design
		g.setColor(Color.white);
		Draw2D.drawRect(0, 200, 350, 75, g);
		
		
		repaint();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Update
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	public void setSettings() {
		
		addKeyListener(this);
		setFocusable(true);
		this.setFocusTraversalKeysEnabled(false);
		
		timer = new Timer(delay,this);
		timer.start();
		
	}

}
