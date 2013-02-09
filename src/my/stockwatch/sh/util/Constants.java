package my.stockwatch.sh.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Constants {
	static String FILENAME = "src" + File.separator + "config" + File.separator + "MetaInfo.txt"; 
	
	public static String[] getMetaInfo()
	{
		
		File file = new File(FILENAME);
		char[] chars = new char[(int) file.length()];
		FileReader fr;
		try {
			fr = new FileReader(file);
			fr.read(chars);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuffer sb = new StringBuffer();
		sb.append(chars);
		String[] result = sb.toString().trim().split("-");
		return result;
	}
	
}
