import static org.junit.Assert.*;
import org.junit.Test;

public class PathsTest {
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


	// @Test
	// public void doesPathsExists_from_Chennai_to_Tokyo_should_throw_Chennai_City_donot_exist_exception (){
	// 	Paths paths = new Paths();
	// 	try {
	// 		paths.doesPathExists("Chennai", "Tokyo");
	// 	}
	// 	catch(Exception e) {
	// 		assertEquals(e.getMessage(), "No city named \"Chennai\" in database");
	// 	}
	// }
	// @Test
	// public void doesPathsExists_from_Bangalore_to_Stockholm_should_throw_Stockholm_City_donot_exist_exception (){
	// 	Paths paths = new Paths();
	// 	try {
	// 		paths.doesPathExists("Bangalore", "Stockholm");
	// 	}
	// 	catch(Exception e) {
	// 		System.out.println(e.getMessage());
	// 		assertEquals(e.getMessage(), "No city named \"Stockholm\" in database");
	// 	}
	// }
	// @Test
	// public void doesPathsExists_from_Bangalore_Stockholm_should_give_false () {
	// 	Paths paths = new Paths();
	// 	assertTrue(!paths.doesPathExists("Bangalore", "Stockholm"));
	// }
}