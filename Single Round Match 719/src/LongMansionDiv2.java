import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LongMansionDiv2 {
	
	public long minimalTime(int M, int[] t) {
		long time = 0;
		int minRow = 0; long minVal = t[0];
		for(int j =0; j < t.length; j++) {
			if (t[j] < minVal) {
				minRow = j;
				minVal = t[j];
			}
		}
		for(int j =0; j < minRow; j++) {
			time +=t[j];
		}
		time += minVal*M;
		for(int j =minRow+1; j < t.length; j++) {
			time +=t[j];
		}

		return time;
	}
}
