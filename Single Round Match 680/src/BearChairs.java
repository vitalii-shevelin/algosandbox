import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearChairs {
	
	public int[] findPositions(int[] atLeast, int d) {

		int last = atLeast[0];
		int seats[] = new int[atLeast.length];
		seats[0] = last;
		int first = last;
		for(int i = 1; i < atLeast.length; i++) {

			int[] work = new int[i];
			System.arraycopy(seats, 0, work, 0, i);
			Arrays.sort(work);

			int gap = locateGap(work, i, atLeast[i], d);
			if (gap > 0) {
				seats[i] = gap;
			} else {
				if(atLeast[i] > last +d) {
					last = atLeast[i];
				} else {
					last +=d;
				}
				seats[i] = last;
			}
		}
		return seats;

	}

	int locateGap(int[] seats, int filled, int least, int d) {
		int prev = - 1;
		for(int i = 0; i < filled; i++) {
			if(least < seats[i]) {
				if (prev > 0) {
					if (prev + d >= least) {
						if (prev+d+d <= seats[i]) {
							return prev+d;
						}
					}
				} else {
					if(least + d <= seats[i]) {
						return least;
					}
				}
			}
			prev = seats[i];
		}
		return -1;
	}
}
