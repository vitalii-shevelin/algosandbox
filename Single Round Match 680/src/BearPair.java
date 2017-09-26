import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearPair {
	
	public int bigDistance(String s) {
		int diffX = 0;
		for (int x = 0; x < s.length(); x++) {
			for (int y = s.length()-1; y >= 0; y--) {
				if (s.charAt(x) != s.charAt(y)) {
					diffX = y - x;
					break;
				}
				if (x == y) {
					diffX = -1;
					break;
				}
			}
			if(diffX != 0) break;
		}
		int diffY = 0;
		for (int y =s.length()-1; y >= 0; y--) {
			for (int x = 0; x < s.length(); x++) {
				if (s.charAt(x) != s.charAt(y)) {
					diffY = y - x;
					break;
				}
				if (x == y) {
					diffY = -1;
					break;
				}
			}
			if(diffY != 0) break;
		}
		if (diffX > diffY)
			return diffX;
		else
			return diffY;

	}
}
