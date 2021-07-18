package Core;

import Core.Windows.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Core.Console.*;
import Core.Game.*;
import Core.Physics.Vector2;

public class Launcher {

	public static void main(String[] args) {
		
		//Init windows
		JFrame gameWindow = new JFrame("TEST");
		JFrame consoleWindow = new JFrame("Console");
		
		Vector2 gameCenter = WindowSettings.ScreenCenterWindow(800, 600);
		Vector2 consoleCenter = WindowSettings.ScreenCenterWindow(400, 300);
		//GameWindow settings
		
		gameWindow.setSize(800, 600);
		gameWindow.setLocation((int)gameCenter.x, (int)gameCenter.y);
		gameWindow.setResizable(false);
		
		//gameWindow.windowType = WindowSettings.WindowType.Windowed;
		//gameWindow.windowPosition = WindowSettings.WindowPosition.Centered;
		//WindowSettings.setWindows(gameWindow);
		
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		//ConsoleWindow settings
		
		consoleWindow.setSize(400, 300);
		consoleWindow.setLocation(0, 0);
		consoleWindow.setResizable(false);
		
		//consoleWindow.windowType = WindowSettings.WindowType.Windowed;
		//consoleWindow.windowPosition = WindowSettings.WindowPosition.LeftTop;
		//WindowSettings.setWindows(consoleWindow);
		
		consoleWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		///////////////////////////////////////////////////
		
		//ConsoleWindow Components
		
		JPanel consolePanel = new Console();
		consoleWindow.add(consolePanel);
		
		//////////////////////////////
		consoleWindow.setVisible(true);
		
		
		gameWindow.setVisible(true);
		
	}

}
