import java.util.*;
import java.math.*;
import static java.lang.Math.*;
//todo: find a solution!
public class ParenthesesDiv2Hard {
	
	public int minSwaps(String s, int[] L, int[] R) {

		String[] pieces = new String[L.length];
		for(int  i =0; i < L.length; i++) {
			pieces[i] = s.substring(L[i], R[i]+1);
			if((pieces[i].length() & 1) > 0)
				return -1;
		}
		int[] offersOp = new int[L.length];
		int[] offersCl = new int[L.length];
		for(String ss : pieces) {
			int depth = 0;
			int needOp = 0;
			int needClose = 0;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '(') {
					depth++;
				} else if(s.charAt(i) == ')') {
					depth--;
				};
				if(depth <0) {
					needOp++;
				}
			}
			needClose = (depth > 0) ? depth / 2 : depth;

		}

		return 0;
	}

	private int testString(String s) {
		int depth = 0;
		int turns = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				depth++;
			} else if(s.charAt(i) == ')') {
				depth--;
			};
			if(depth <0) {
				turns++;
			}
		}
		turns+=  depth/2;
		return turns;
	}
	private boolean testStrings(String[] ss) {
		int depth = 0;
		for(String s : ss) {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '(') {
					depth++;
				} else if(s.charAt(i) == ')') {
					depth--;
				};
			}
			if (depth !=0) return false;

		}
		return true;
	}

}
