import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DietPlan {
	
	public String chooseDinner(String diet, String breakfast, String lunch) {
		String dinner = diet;
		for(int c = 0; c < breakfast.length(); c++) {
			int index = dinner.indexOf(breakfast.charAt(c));
			if(index > 0) {
				dinner = dinner.substring(0, index ) + dinner.substring(index+1, dinner.length()-1);
			}
		}
		for(int c = 0; c < lunch.length(); c++) {
			int index = dinner.indexOf(lunch.charAt(c));
			if(index > 0) {
				dinner = dinner.substring(0, index ) + ((index >= dinner.length()-1) ? "" : dinner.substring(index+1, dinner.length()-1));
			}
		}
		if(dinner.length() == 0)
			dinner = "CHEATER";

		return dinner;
	}
}
