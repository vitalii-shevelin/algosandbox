import org.junit.Test;
import static org.junit.Assert.*;

public class AlphabetOrderDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		String[] words = new String[] {"single","round","match"};
		assertEquals("Possible", new AlphabetOrderDiv2().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] words = new String[] {"topcoder","topcoder"};
		assertEquals("Impossible", new AlphabetOrderDiv2().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] words = new String[] {"algorithm", "contest"};
		assertEquals("Impossible", new AlphabetOrderDiv2().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] words = new String[] {"pink","floyd"};
		assertEquals("Possible", new AlphabetOrderDiv2().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] words = new String[] {"gimnasia","y","esgrima","la","plata"};
		assertEquals("Impossible", new AlphabetOrderDiv2().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] words = new String[] {"hello","hello"};
		assertEquals("Possible", new AlphabetOrderDiv2().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test6() {
		String[] words = new String[] {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		assertEquals("Possible", new AlphabetOrderDiv2().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test7() {
		String[] words = new String[] {"abc","bca"};
		assertEquals("Impossible", new AlphabetOrderDiv2().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test8() {
		String[] words = new String[] {"aaaaa","eeeee","iiiii","ooooo","uuuuu"} ;
		assertEquals("Possible", new AlphabetOrderDiv2().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test9() {
		String[] words = new String[] {"ab","bc","ca"};
		assertEquals("Impossible", new AlphabetOrderDiv2().isOrdered(words));
	}
}
