import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PrimalUnlicensedCreatures {
	
	public int maxWins(int initialLevel, int[] grezPower) {

        int[] work = new int[grezPower.length];
        System.arraycopy(grezPower, 0, work, 0, grezPower.length);
        int wins = 0;
        int current = initialLevel;
        int prevwins = 0;
        while(true) {
            for(int i = 0; i < grezPower.length; i++) {
                if(work[i] > 0 && work[i] < current ) {
                    current += work[i] /2;
                    wins++;
                    work[i] = 0;
                }
            }
            if(wins == prevwins) {
                break;
            }
            prevwins = wins;
        }

		return wins;
	}
}
