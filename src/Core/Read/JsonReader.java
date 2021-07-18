package Core.Read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;



public class JsonReader {
	
	
	
	
	public static String GetString(String path,String name) {
		String result = "";
		
		JSONParser parser = new JSONParser();
		
		try {
			
			FileReader fr = new FileReader(path);
			Object obj = parser.parse(fr);
			
			JSONObject JsonObj = (JSONObject) obj;
			
			
			result = (String) JsonObj.get(name);
			
			fr.close();
			parser = null;
			fr = null;
			obj = null;
			JsonObj = null;
			
			System.gc();
			
			return result;
			
		}
		
		catch(Exception e) {
			System.out.println(e.toString());
			return "";
		}
		
		
	}
	
	public static boolean GetBoolean(String path,String name) {
		boolean result = true;
		
		JSONParser parser = new JSONParser();
		
		try {
			
			FileReader fr = new FileReader(path);
			Object obj = parser.parse(fr);
			
			JSONObject JsonObj = (JSONObject) obj;
			
			result = (boolean) JsonObj.get(name);
			
			fr.close();
			parser = null;
			fr = null;
			obj = null;
			JsonObj = null;
			
			System.gc();
			
			return result;
			
		}
		
		catch(Exception e) {
			System.out.println(e.toString());
			return false;
		}
		
		
	}
	
	
	public static void SetString(String path,String name,String value) {
		
		JSONParser parser = new JSONParser();
		
		try {
			
			FileReader fr = new FileReader(path);
			Object obj = parser.parse(fr);
			
			JSONObject JsonObj = (JSONObject) obj;
			
			JsonObj.put(name, value);
			
			
			fr.close();
			parser = null;
			fr = null;
			obj = null;
			JsonObj = null;
			
			System.gc();
			
			
			
		}
		
		catch(Exception e) {
			System.out.println(e.toString());
			
		}
		
		
	}
	
}
