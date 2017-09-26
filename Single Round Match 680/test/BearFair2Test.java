import org.junit.Test;
import static org.junit.Assert.*;

public class BearFair2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 3;
		int b = 5;
		int[] upTo = new int[] {2,3};
		int[] quantity = new int[] {1,2};
		assertEquals("fair", new BearFair2().isFair(n, b, upTo, quantity));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 6;
		int b = 1000;
		int[] upTo = new int[] {500,100,950};
		int[] quantity = new int[] {4,3,6};
		assertEquals("fair", new BearFair2().isFair(n, b, upTo, quantity));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 6;
		int b = 20;
		int[] upTo = new int[] {5,19,10};
		int[] quantity = new int[] {0,3,2};
		assertEquals("unfair", new BearFair2().isFair(n, b, upTo, quantity));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 3;
		int b = 6;
		int[] upTo = new int[] {1,2,3,4};
		int[] quantity = new int[] {1,1,1,2};
		assertEquals("unfair", new BearFair2().isFair(n, b, upTo, quantity));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 48;
		int b = 1000;
		int[] upTo = new int[] {38,450,202,685,971,661,946,226,901,353,12,937,655,108,31,908,845,908,981,896,296,987,77,790,679,
152,412,492,286,54,214,651,59,189,107,445,728,327,438,523,527,663,825,67,523,400,65,892,587,995};
		int[] quantity = new int[] {1,19,8,32,48,31,48,8,43,13,0,46,30,8,1,45,42,45,48,43,13,48,6,40,32,8,17,20,13,3,8,30,3,8,8,19,
37,13,19,21,21,31,41,4,21,16,4,43,23,48}
;
		assertEquals("fair", new BearFair2().isFair(n, b, upTo, quantity));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int n = 3;
		int b = 100;
		int[] upTo = new int[] {40,60};
		int[] quantity = new int[] {2,1};
		assertEquals("unfair", new BearFair2().isFair(n, b, upTo, quantity));
	}
}
