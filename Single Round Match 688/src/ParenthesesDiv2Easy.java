import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ParenthesesDiv2Easy {
	
	public int getDepth(String s) {
		int depth = 0;
		int maxDepth =0 ;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				depth++;
			} else if(s.charAt(i) == ')') {
				depth--;
			};
			if (depth > maxDepth) {
				maxDepth = depth;
			}
		}
		return maxDepth;
	}
}
