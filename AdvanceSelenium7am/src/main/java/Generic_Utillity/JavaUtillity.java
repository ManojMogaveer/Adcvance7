package Generic_Utillity;

import java.util.Random;

public class JavaUtillity {

	/**
	 * 
	 * @return
	 * @author DELL
	 */
	public int getRandomNum()
	{
		
		Random r = new Random();
		int ranNum = r.nextInt(1000);
		return ranNum;
		

	}

}
