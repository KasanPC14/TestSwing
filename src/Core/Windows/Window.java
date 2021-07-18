package Core.Windows;

import java.awt.*;
import javax.swing.*;

import Core.Physics.Vector2;


public class Window extends JFrame{
	
	
	
	public int windowWidth;
	public int windowHeight;
	
	
	public WindowSettings.WindowPosition windowPosition;
	public WindowSettings.WindowType windowType;
	
	public Window(int width, int height, String title) {
		super.setTitle(title);
		super.setSize(width, height);
		
		windowWidth = width;
		windowHeight = height;
		
		
	}
	
	

	
	
	
}
