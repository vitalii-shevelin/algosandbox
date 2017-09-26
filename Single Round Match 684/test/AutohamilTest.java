import org.junit.Test;
import static org.junit.Assert.*;

public class AutohamilTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] z0 = new int[] {0,1};
		int[] z1 = new int[] {0,1};
		assertEquals("Does not exist", new Autohamil().check(z0, z1));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] z0 = new int[] {1,1};
		int[] z1 = new int[] {1,1};
		assertEquals("Exists", new Autohamil().check(z0, z1));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] z0 = new int[] {1,2,2};
		int[] z1 = new int[] {2,2,2};
		assertEquals("Exists", new Autohamil().check(z0, z1));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] z0 = new int[] {2,2,2};
		int[] z1 = new int[] {2,2,2};
		assertEquals("Does not exist", new Autohamil().check(z0, z1));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] z0 = new int[] {1,2,0,3};
		int[] z1 = new int[] {3,2,0,3};
		assertEquals("Exists", new Autohamil().check(z0, z1));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] z0 = new int[] {1,2,0,4,3,5};
		int[] z1 = new int[] {1,2,3,5,4,5};
		assertEquals("Exists", new Autohamil().check(z0, z1));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int[] z0 = new int[] {1,2,0,4,4,5};
		int[] z1 = new int[] {1,2,3,5,4,5};
		assertEquals("Does not exist", new Autohamil().check(z0, z1));
	}
}
