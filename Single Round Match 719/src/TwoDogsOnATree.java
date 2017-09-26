import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TwoDogsOnATree {
	
	public int maximalXorSum(int[] parent, int[] w) {
		int[][] matrix = new int[parent.length+1][parent.length+1];
//		Arrays.fill(matrix, 0);
		for(int i = 0; i < parent.length; i++){
			matrix[i+1][parent[i]] = w[i];
		}

		LinkedList<LinkedList<Integer>> found = new LinkedList<>();
		HashMap<LinkedList<Integer>, Integer> xxx = new LinkedHashMap<>();


		for(int y = 0; y <= parent.length; y++) {
			for(int x = y ; x <= parent.length; x++) {
				if (matrix[x][y] > 0) {
					LinkedList<Integer> newStep = new LinkedList<>();
					newStep.add(x);
					newStep.add(y);
					found.add(newStep);
					xxx.put(newStep, matrix[x][y]);
					LinkedList<LinkedList<Integer>> toAdd = new LinkedList<>();
					for(LinkedList<Integer> oldStep : found) {
						if (oldStep.getFirst().equals(newStep.getLast())) {
							if(!oldStep.contains(newStep.getFirst())) {
								LinkedList<Integer> extStep = new LinkedList<>(oldStep);
								extStep.add(0, newStep.getFirst());
								toAdd.add(extStep);
								xxx.put(extStep, xxx.get(oldStep) ^ matrix[x][y]);
							}
						} else
						if (oldStep.getFirst().equals(newStep.getLast())) {
							if(!oldStep.contains(newStep.getLast())) {
								LinkedList<Integer> extStep = new LinkedList<>(oldStep);
								extStep.add(newStep.getLast());
								toAdd.add(extStep);
								xxx.put(extStep, xxx.get(oldStep) ^ matrix[x][y]);
							}
						}
					}
					found.addAll(toAdd);
				}
			}
		}

		LinkedList<Integer> mp = null;
		Integer mx = 0;
		for(LinkedList<Integer> path1 : found) {
			LinkedList<Integer> test = new LinkedList<>(path1);
			for(LinkedList<Integer> path2 : found) {
				test.retainAll(path2);
				if(test.isEmpty()) {
					Integer ix = xxx.get(path1) ^ xxx.get(path2);
					mx = mx > ix ? mx : ix;
				}
			}
		}
		return mx;
	}

}
