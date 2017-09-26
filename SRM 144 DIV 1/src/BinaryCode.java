import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BinaryCode {
	
	public String[] decode(String message) {

	}

	private String guess(int guess, String message) {
		int[] dec = new int[message.length()];
		dec[0] = guess;
		int pos = 0;
		for(char num : message.toCharArray()) {
			int val = num -'0';
			guess = num
			dec[pos++] = guess;
			guess = num
		}
		return null;


	}
}
