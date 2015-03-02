import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;

public class PathsTest {
	private static void foo()throws java.lang.Exception{
	 throw 	new java.lang.Exception("Pooja");
	} 
	@Test
	public void doesPathsExists_from_Bangalore_to_Singapore_should_give_true() throws Exception {
		Paths paths = new Paths();
		assertTrue(paths.doesPathExists("Bangalore", "Singapore"));
	}
	@Test
	public void doesPathsExists_from_Bangalore_to_Tokyo_should_give_true () throws Exception {
		Paths paths = new Paths();
		assertTrue(paths.doesPathExists("Bangalore", "Tokyo"));
	}
	@Test
	public void doesPathsExists_from_Tokyo_to_Bangalore_should_give_true () throws Exception {
		Paths paths = new Paths();
		assertTrue(paths.doesPathExists("Tokyo", "Bangalore"));
	}

	@Test
	public void doCityExist_should_give_false_when_city_doesnot_exist_in_database () {
		Paths paths = new Paths();
		assertFalse(paths.doCityExist("Chennai"));
	}

	@Test
	public void doCityExist_should_give_true_when_city_exists_in_database () {
		Paths paths = new Paths();
		assertTrue(paths.doCityExist("Bangalore"));
	}

	@Test(expected = java.lang.Exception.class)
	public void doesPathsExists_from_Chennai_to_Tokyo_should_throw_Chennai_City_donot_exist_exception () throws Exception{
		Paths paths = new Paths();
		paths.doesPathExists("Chennai", "Tokyo");	
	}
	@Test(expected = java.lang.Exception.class)
	public void doesPathsExists_from_Bangalore_to_Stockholm_should_throw_Stockholm_City_donot_exist_exception () throws Exception{
		Paths paths = new Paths();
		paths.doesPathExists("Bangalore", "Stockholm");
	}
}