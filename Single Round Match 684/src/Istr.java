import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Istr {
	
	public int count(String s, int k) {
		long counters[] = new long[26];
		Arrays.fill(counters, 0);

		for(int i=0; i < s.length(); i++) {
			counters[s.charAt(i) - 'a']++;
		}

		Arrays.sort(counters);

		for(int n=0; n < k; n++) {
			counters[25]--;
			Arrays.sort(counters);
		}

		int result = 0;
		for(int i = 0; i < 26; i++) {
			result += counters[i]*counters[i];
		}

		return result;
	}
}

