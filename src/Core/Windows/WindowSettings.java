package Core.Windows;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import Core.Physics.Vector2;

public class WindowSettings {
	
	
	public static enum WindowType{
		Fullscreen,
		Windowed,
	}
	
	public static enum WindowPosition{
		Centered,
		LeftTop,
	}
	
	public static Vector2 ScreenCenterWindow(int windowWidth, int windowHeight) {
		
		//Get monitor 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int scr_width = (int)screenSize.getWidth();
		int scr_height = (int)screenSize.getHeight();
		
		Vector2 GetCenter = new Vector2(0,0);
		GetCenter.x = (scr_width/2) - windowWidth/2;
		GetCenter.y = (scr_height/2)- windowHeight/2;
		
		return GetCenter;
	}
	
	public static void setWindows(Window frame) {
		
		
		if(frame.windowPosition == WindowPosition.LeftTop) {
			frame.setBounds(0, 0, frame.windowWidth, frame.windowHeight);
			}
		
		else if(frame.windowPosition == WindowPosition.Centered) {
			frame.setBounds((int)ScreenCenterWindow(frame.windowWidth,frame.windowHeight).x, (int)ScreenCenterWindow(frame.windowWidth,frame.windowHeight).y, frame.windowWidth, frame.windowHeight);
			}
		
		
	}
	
	public static Vector2 ScreenSize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int scr_width = (int)screenSize.getWidth();
		int scr_height = (int)screenSize.getHeight();
		return new Vector2(scr_width,scr_height);
	}
}
