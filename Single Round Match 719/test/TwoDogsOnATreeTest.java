import org.junit.Test;
import static org.junit.Assert.*;

public class TwoDogsOnATreeTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] parent = new int[] {0, 0, 0, 0};
		int[] w = new int[] {1, 2, 4, 8};
		assertEquals(15, new TwoDogsOnATree().maximalXorSum(parent, w));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] parent = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8};
		int[] w = new int[] {3, 2, 6, 5, 8, 1, 3, 4, 3};
		assertEquals(15, new TwoDogsOnATree().maximalXorSum(parent, w));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] parent = new int[] {0, 0, 2, 2, 4, 4, 5, 6};
		int[] w = new int[] {13, 16, 12, 11, 3, 1, 4, 2};
		assertEquals(31, new TwoDogsOnATree().maximalXorSum(parent, w));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] parent = new int[] {0, 0, 2, 0, 1, 2, 2, 4, 6, 1, 5};
		int[] w = new int[] {628, 589, 815, 864, 459, 507, 733, 239, 904, 592, 818};
		assertEquals(1017, new TwoDogsOnATree().maximalXorSum(parent, w));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] parent = new int[] {};
		int[] w = new int[] {};
		assertEquals(0, new TwoDogsOnATree().maximalXorSum(parent, w));
	}
}
