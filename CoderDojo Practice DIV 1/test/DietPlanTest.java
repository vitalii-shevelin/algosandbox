import org.junit.Test;
import static org.junit.Assert.*;

public class DietPlanTest {
	
	@Test(timeout=2000)
	public void test0() {
		String diet = "ABCD";
		String breakfast = "AB";
		String lunch = "C";
		assertEquals("D", new DietPlan().chooseDinner(diet, breakfast, lunch));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String diet = "ABEDCS";
		String breakfast = "";
		String lunch = "";
		assertEquals("ABCDES", new DietPlan().chooseDinner(diet, breakfast, lunch));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String diet = "EDSMB";
		String breakfast = "MSD";
		String lunch = "A";
		assertEquals("CHEATER", new DietPlan().chooseDinner(diet, breakfast, lunch));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String diet = "";
		String breakfast = "";
		String lunch = "";
		assertEquals("", new DietPlan().chooseDinner(diet, breakfast, lunch));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String diet = "IWANTSODER";
		String breakfast = "SOW";
		String lunch = "RAT";
		assertEquals("DEIN", new DietPlan().chooseDinner(diet, breakfast, lunch));
	}
}
