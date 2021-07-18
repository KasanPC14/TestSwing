package Core.Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	
	static String Read(String url) {
		try {
			
			File myObj = new File(url);
			Scanner myReader = new Scanner(myObj);
			String allText = "";
			
			while (myReader.hasNextLine()) {
				
				String data = myReader.nextLine();
				allText += data + "\n";
			}
			
			return allText;
			
		}
		
		catch(FileNotFoundException e) {
			
			return "";
			
		}
	}
}
