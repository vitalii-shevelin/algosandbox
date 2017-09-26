import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SuperUserDo {
	
	public int install(int[] A, int[] B) {
		String f = n(1001, "0");
		for(int i = 0; i < A.length; i++) {
			f = f.substring(0, A[i]) + n(B[i] - A[i]+  1, "1") + f.substring(B[i]+1);
		}
		return f.replaceAll("0", "").length();
	}

	private String n(int n, String s) {
		return new String(new char[n]).replace("\0", s);
	}
}
