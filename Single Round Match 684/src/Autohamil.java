import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Autohamil {
	
	public String check(int[] z0, int[] z1) {
		Set<Integer> visited = new HashSet<>();

		test(z0, z1, true, 0, visited);
		test(z0, z1, false, 0, visited);

		return visited.size() == z0.length ? "Exists" : "Does not exist";
	}
	private void test(int[] z0, int[] z1, boolean input, int current, Set<Integer> visited) {
		visited.add(current);
		int next = input? z0[current] : z1[current];
		if(!visited.contains(next)) {
			test(z0, z1, true, next, visited);
			test(z0, z1, false, next, visited);
		}
	}



}
