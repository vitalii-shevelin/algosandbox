import org.junit.Test;
import static org.junit.Assert.*;

public class BearChairsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] atLeast = new int[] {1,21,11,7};
		int d = 10;
		int[] result = new BearChairs().findPositions(atLeast, d);
		assertArrayEquals(new int[] {1, 21, 11, 31 }, result);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] atLeast = new int[] {1,21,11,7};
		int d = 11;
		int[] result = new BearChairs().findPositions(atLeast, d);
		assertArrayEquals(new int[] {1, 21, 32, 43 }, result);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] atLeast = new int[] {1000000,1000000,1000000,1};
		int d = 1000000;
		int[] result = new BearChairs().findPositions(atLeast, d);
		assertArrayEquals(new int[] {1000000, 2000000, 3000000, 4000000 }, result);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] atLeast = new int[] {1000000,1000000,1000000,1};
		int d = 999999;
		int[] result = new BearChairs().findPositions(atLeast, d);
		assertArrayEquals(new int[] {1000000, 1999999, 2999998, 1 }, result);
	}

	@Test(timeout=2000)
	public void test4() {
		int[] atLeast = new int[] {100,100,20,20,1};
		int d = 20;
		int[] result = new BearChairs().findPositions(atLeast, d);
		assertArrayEquals(new int[] {100, 120, 20, 40, 60 }, result);
	}

	@Test(timeout=2000)
	public void test5() {
		int[] atLeast = new int[] {100,100,20,20,1};
		int d = 15;
		int[] result = new BearChairs().findPositions(atLeast, d);
		assertArrayEquals(new int[] {100, 115, 20, 35, 1 }, result);
	}
}
