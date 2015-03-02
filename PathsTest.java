import static org.junit.Assert.*;
import org.junit.Test;

public class PathsTest {
	@Test
	public void doesPathsExists_from_Bangalore_to_Singapore_should_give_true () {
		Paths paths = new Paths();
		assertTrue(paths.doesPathExists("Bangalore", "Singapore"));
	}
	@Test
	public void doesPathsExists_from_Bangalore_to_Tokyo_should_give_true () {
		Paths paths = new Paths();
		assertTrue(paths.doesPathExists("Bangalore", "Tokyo"));
	}
	@Test
	public void doesPathsExists_from_Tokyo_to_Bangalore_should_give_true () {
		Paths paths = new Paths();
		assertTrue(paths.doesPathExists("Tokyo", "Bangalore"));
	}
	@Test
	public void doesPathsExists_from_Chennai_to_Tokyo_should_give_false () {
		Paths paths = new Paths();
		assertTrue(!paths.doesPathExists("Chennai", "Tokyo"));
	}
	@Test
	public void doesPathsExists_from_Bangalore_Stockholm_should_give_false () {
		Paths paths = new Paths();
		assertTrue(!paths.doesPathExists("Bangalore", "Stockholm"));
	}
}