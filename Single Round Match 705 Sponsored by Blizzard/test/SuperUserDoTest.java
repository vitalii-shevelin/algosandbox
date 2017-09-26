import org.junit.Test;
import static org.junit.Assert.*;

public class SuperUserDoTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] A = new int[] {1};
		int[] B = new int[] {10};
		assertEquals(10, new SuperUserDo().install(A, B));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] A = new int[] {1,101};
		int[] B = new int[] {10,110};
		assertEquals(20, new SuperUserDo().install(A, B));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] A = new int[] {1};
		int[] B = new int[] {1000};
		assertEquals(1000, new SuperUserDo().install(A, B));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] A = new int[] {1,2,3,4,5};
		int[] B = new int[] {6,7,8,9,10};
		assertEquals(10, new SuperUserDo().install(A, B));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] A = new int[] {1,1};
		int[] B = new int[] {1,1};
		assertEquals(1, new SuperUserDo().install(A, B));
	}

	@Test(timeout=2000)
	public void test5() {
		int[] A = new int[] {1,3,1};
		int[] B = new int[] {2,4,4};
		assertEquals(4, new SuperUserDo().install(A, B));
	}
}
