import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ParenthesesDiv2Medium {
	
	public int[] correct(String s) {
		int f = 0;
		int d[] = new int[s.length()];
		int r[] = new int[s.length()];
		int depth = 0;
		String s2 = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				depth++;
			} else if(s.charAt(i) == ')') {
				depth--;
			};
			if(depth < 0) {
				depth=1;
				r[f++] = i;
				s2 += "(";
			} else {
				s2+=s.charAt(i);
			}
		}
		depth= 0;
		for(int i = s2.length()-1; i >=0; i--) {
			if(s2.charAt(i) == ')') {
				depth++;
			} else if(s2.charAt(i) == '(') {
				depth--;
			};
			if(depth < 0) {
				depth =1;
				r[f++] = i;
			} else {
			}
		}
		int[] res = Arrays.copyOf(r, f);
		Arrays.sort(res);
		return res;
	}
}
