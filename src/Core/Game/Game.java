package Core.Game;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import Core.Windows.*;

public class Game extends JPanel implements KeyListener,ActionListener{

	private Timer timer;
	int delay = 5;
	
	
	public Game(){
		setSettings();
	}
	
	public void paint(Graphics g) {
		
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
