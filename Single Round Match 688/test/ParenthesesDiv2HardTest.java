import org.junit.Test;
import static org.junit.Assert.*;

public class ParenthesesDiv2HardTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = ")(";
		int[] L = new int[] {0};
		int[] R = new int[] {1};
		assertEquals(1, new ParenthesesDiv2Hard().minSwaps(s, L, R));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "(())";
		int[] L = new int[] {0,2};
		int[] R = new int[] {1,3};
		assertEquals(1, new ParenthesesDiv2Hard().minSwaps(s, L, R));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "(((())";
		int[] L = new int[] {0,2};
		int[] R = new int[] {1,3};
		assertEquals(2, new ParenthesesDiv2Hard().minSwaps(s, L, R));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "(((((((((";
		int[] L = new int[] {0,2};
		int[] R = new int[] {1,3};
		assertEquals(-1, new ParenthesesDiv2Hard().minSwaps(s, L, R));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "))()())((()()()()()())))((((((";
		int[] L = new int[] {1,6,13,17,23,25};
		int[] R = new int[] {4,7,16,20,24,28};
		assertEquals(5, new ParenthesesDiv2Hard().minSwaps(s, L, R));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String s = "(";
		int[] L = new int[] {0};
		int[] R = new int[] {0};
		assertEquals(-1, new ParenthesesDiv2Hard().minSwaps(s, L, R));
	}
}
