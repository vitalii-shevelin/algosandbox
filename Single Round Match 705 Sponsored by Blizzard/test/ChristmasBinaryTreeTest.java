import org.junit.Test;
import static org.junit.Assert.*;

public class ChristmasBinaryTreeTest {
	
	@Test(timeout=2000)
	public void test0() {
		long depth = 1L;
		int[] left = new int[] {0};
		int[] right = new int[] {0};
		assertEquals(1, new ChristmasBinaryTree().count(depth, left, right));
	}
	
	@Test(timeout=2000)
	public void test1() {
		long depth = 3L;
		int[] left = new int[] {0,1,2};
		int[] right = new int[] {0,1,2};
		assertEquals(16, new ChristmasBinaryTree().count(depth, left, right));
	}
	
	@Test(timeout=2000)
	public void test2() {
		long depth = 4L;
		int[] left = new int[] {1,2,0};
		int[] right = new int[] {2,0,1};
		assertEquals(22, new ChristmasBinaryTree().count(depth, left, right));
	}
	
	@Test(timeout=2000)
	public void test3() {
		long depth = 4L;
		int[] left = new int[] {0,2,2};
		int[] right = new int[] {1,1,2};
		assertEquals(64, new ChristmasBinaryTree().count(depth, left, right));
	}
	
	@Test(timeout=2000)
	public void test4() {
		long depth = 1000000000000L;
		int[] left = new int[] {0,1,2,3};
		int[] right = new int[] {1,1,2,2};
		assertEquals(465080044, new ChristmasBinaryTree().count(depth, left, right));
	}
}
