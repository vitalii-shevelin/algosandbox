import java.lang.reflect.Array;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;

import static java.lang.Math.*;

public class LongLiveZhangzj {
	
	public int donate(String[] speech, String[] words) {
		int don = 0;
		Set<String> wordSet = new HashSet<String>(Arrays.asList(words));
		for(String sp : speech) {
			if (wordSet.contains(sp)) {
				don++;
			}
		}
		return don;
	}

}
