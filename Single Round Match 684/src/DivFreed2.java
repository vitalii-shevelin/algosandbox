import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DivFreed2 {
	
	public int count(int n, int k) {
		long mods = 0;
		for (int i = 1; i < k; i++) {
			for(int j = i; j <k; j++) {
				if(j % i  > 0) {
					mods ++;
				}
			}
		}
		double res = Math.pow(k, n);


		return 0;
	}
}
