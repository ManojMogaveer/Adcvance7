package Generic_Utillity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * 
 * @param key
 * @return
 * @throws Throwable
 * @author DELL
 *
 */
public class FileUtillity {

	public String getKeyAndValue(String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/AdvSelcomData.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
		
	}

}
