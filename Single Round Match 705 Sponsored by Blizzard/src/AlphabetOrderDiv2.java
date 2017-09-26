import java.util.*;
import java.math.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.*;

public class AlphabetOrderDiv2 {
	
	public String isOrdered(String[] words) {
		String ab = "abcdefghijklmnopqrstuvwxyz";
		String [] gt = new String[26];
		String [] lt = new String[26];
		Arrays.fill(gt, "");
		Arrays.fill(lt, "");
		for(String w : words) {
			for(int c = 0; c< w.length(); c++){
				if (c > 0) {
					lt[w.charAt(c) - 'a'] += w.substring(0, c);
				}
				if (c < w.length()-1) {
					gt[w.charAt(c) - 'a'] += w.substring(c+1);
				}
			}
		}
		for(int i = 0; i< 26; i++) {
			for(int c =0; c < gt[i].length(); c++) {
				if(lt[i].length() > 0 && lt[i].indexOf(gt[i].charAt(c)) > 0) {
					return "Impossible";
				}
			}
			for(int c =0; c < lt[i].length(); c++) {
				if(gt[i].length() > 0 && gt[i].indexOf(lt[i].charAt(c)) > 0) {
					return "Impossible";
				}
			}
		}
		return "Possible";
	}

	private String cmp(String a) {
		return String.join("", Stream.of(a.toCharArray()).map(chars1 -> "" + chars1).collect(Collectors.toSet()));
	}

}
