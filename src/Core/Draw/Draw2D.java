package Core.Draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import Core.Physics.Vector2;
import Core.Read.JsonReader;
import Core.Windows.WindowSettings;

public class Draw2D {
	public static void fillRect(int x, int y, int w, int h, Graphics g) {
		
		Polygon p = new Polygon();
		
		p.addPoint(x, y);
		p.addPoint(x+w, y);
		p.addPoint(x+w, y+h);
		p.addPoint(x, y+h);
		
		g.fillPolygon(p);
	}
	
public static void drawRect(int x, int y, int w, int h, Graphics g) {
		
		Polygon p = new Polygon();
		
		p.addPoint(x, y);
		p.addPoint(x+w, y);
		p.addPoint(x+w, y+h);
		p.addPoint(x, y+h);
		
		g.drawPolygon(p);
	}
	
	public static void setBackground(Graphics g,String path){
		
		Vector2 screenSize = WindowSettings.ScreenSize();
		Color oldColor = g.getColor();
		
		
		try {
			//////////Set new Colors
			int c_r = Integer.parseInt(JsonReader.GetString(path, "gui_background_r"));
			int c_g = Integer.parseInt(JsonReader.GetString(path, "gui_background_g"));
			int c_b = Integer.parseInt(JsonReader.GetString(path, "gui_background_b"));
		
			if(c_r > 254) c_r = 254;
			if(c_r < 1) c_r = 1;
		
			if(c_g > 254) c_g = 254;
			if(c_g < 1) c_g = 1;
		
			if(c_b > 254) c_b = 254;
			if(c_b < 1) c_b = 1;
		
		
			Color newColor = new Color(c_r,c_g,c_b);
		
			g.setColor(newColor);
		}
		catch(Exception e) {}
		
		
		fillRect(0,0,(int)screenSize.x,(int)screenSize.y,g);
		g.setColor(oldColor);
	}
	
}
